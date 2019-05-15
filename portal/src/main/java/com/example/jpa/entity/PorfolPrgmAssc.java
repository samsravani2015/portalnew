package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the porfol_prgm_assc database table.
 * 
 */
@Entity
@Table(name="porfol_prgm_assc")
@NamedQuery(name="PorfolPrgmAssc.findAll", query="SELECT p FROM PorfolPrgmAssc p")
public class PorfolPrgmAssc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PORFOL_PRGM_ASSC_ID")
	private int porfolPrgmAsscId;

	@JsonIgnore
	@Column(name="AUD_INSRT_ID")
	private String audInsrtId;

	@JsonIgnore
	@Column(name="AUD_INSRT_TMSTP")
	private Timestamp audInsrtTmstp;

	@JsonIgnore
	@Column(name="AUD_UPDT_ID")
	private String audUpdtId;

	@JsonIgnore
	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;

	@JsonIgnore
	@Temporal(TemporalType.DATE)
	@Column(name="END_DT")
	private Date endDt;

	@JsonIgnore
	@Temporal(TemporalType.DATE)
	@Column(name="START_DT")
	private Date startDt;

	//bi-directional many-to-one association to PorfolInfo
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="PORFOL_ID")
	private PorfolInfo porfolInfo;

	//bi-directional many-to-one association to PrgmInfo
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="PRGM_ID")
	private PrgmInfo prgmInfo;

	//bi-directional many-to-one association to RptDtl
	@JsonIgnore
	@OneToMany(mappedBy="porfolPrgmAssc")
	private List<RptDtl> rptDtls;

	public PorfolPrgmAssc() {
	}

	public int getPorfolPrgmAsscId() {
		return this.porfolPrgmAsscId;
	}

	public void setPorfolPrgmAsscId(int porfolPrgmAsscId) {
		this.porfolPrgmAsscId = porfolPrgmAsscId;
	}

	public String getAudInsrtId() {
		return this.audInsrtId;
	}

	public void setAudInsrtId(String audInsrtId) {
		this.audInsrtId = audInsrtId;
	}

	public Timestamp getAudInsrtTmstp() {
		return this.audInsrtTmstp;
	}

	public void setAudInsrtTmstp(Timestamp audInsrtTmstp) {
		this.audInsrtTmstp = audInsrtTmstp;
	}

	public String getAudUpdtId() {
		return this.audUpdtId;
	}

	public void setAudUpdtId(String audUpdtId) {
		this.audUpdtId = audUpdtId;
	}

	public Timestamp getAudUpdtTmstp() {
		return this.audUpdtTmstp;
	}

	public void setAudUpdtTmstp(Timestamp audUpdtTmstp) {
		this.audUpdtTmstp = audUpdtTmstp;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public PorfolInfo getPorfolInfo() {
		return this.porfolInfo;
	}

	public void setPorfolInfo(PorfolInfo porfolInfo) {
		this.porfolInfo = porfolInfo;
	}

	public PrgmInfo getPrgmInfo() {
		return this.prgmInfo;
	}

	public void setPrgmInfo(PrgmInfo prgmInfo) {
		this.prgmInfo = prgmInfo;
	}

	public List<RptDtl> getRptDtls() {
		return this.rptDtls;
	}

	public void setRptDtls(List<RptDtl> rptDtls) {
		this.rptDtls = rptDtls;
	}

	public RptDtl addRptDtl(RptDtl rptDtl) {
		getRptDtls().add(rptDtl);
		rptDtl.setPorfolPrgmAssc(this);

		return rptDtl;
	}

	public RptDtl removeRptDtl(RptDtl rptDtl) {
		getRptDtls().remove(rptDtl);
		rptDtl.setPorfolPrgmAssc(null);

		return rptDtl;
	}

}