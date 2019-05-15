package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the acct_porfol_assc database table.
 * 
 */
@Entity
@Table(name="acct_porfol_assc")
@NamedQuery(name="AcctPorfolAssc.findAll", query="SELECT a FROM AcctPorfolAssc a")
public class AcctPorfolAssc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCT_PORFOL_ASSC_ID")
	private int acctPorfolAsscId;

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

	//bi-directional many-to-one association to AcctInfo
	@ManyToOne
	@JoinColumn(name="ACCT_ID")
	private AcctInfo acctInfo;

	//bi-directional many-to-one association to PorfolInfo
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="PORFOL_ID")
	private PorfolInfo porfolInfo;

	//bi-directional many-to-one association to RptDtl
	@OneToMany(mappedBy="acctPorfolAssc")
	@JsonIgnore
	private List<RptDtl> rptDtls;

	public AcctPorfolAssc() {
	}

	public int getAcctPorfolAsscId() {
		return this.acctPorfolAsscId;
	}

	public void setAcctPorfolAsscId(int acctPorfolAsscId) {
		this.acctPorfolAsscId = acctPorfolAsscId;
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

	public AcctInfo getAcctInfo() {
		return this.acctInfo;
	}

	public void setAcctInfo(AcctInfo acctInfo) {
		this.acctInfo = acctInfo;
	}

	public PorfolInfo getPorfolInfo() {
		return this.porfolInfo;
	}

	public void setPorfolInfo(PorfolInfo porfolInfo) {
		this.porfolInfo = porfolInfo;
	}

	public List<RptDtl> getRptDtls() {
		return this.rptDtls;
	}

	public void setRptDtls(List<RptDtl> rptDtls) {
		this.rptDtls = rptDtls;
	}

	public RptDtl addRptDtl(RptDtl rptDtl) {
		getRptDtls().add(rptDtl);
		rptDtl.setAcctPorfolAssc(this);

		return rptDtl;
	}

	public RptDtl removeRptDtl(RptDtl rptDtl) {
		getRptDtls().remove(rptDtl);
		rptDtl.setAcctPorfolAssc(null);

		return rptDtl;
	}

}