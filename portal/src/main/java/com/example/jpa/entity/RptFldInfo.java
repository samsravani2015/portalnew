package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the rpt_fld_info database table.
 * 
 */
@Entity
@Table(name="rpt_fld_info")
@NamedQuery(name="RptFldInfo.findAll", query="SELECT r FROM RptFldInfo r")
public class RptFldInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RPT_FLD_ID")
	private int rptFldId;

	@Column(name="AUD_INSRT_ID")
	private String audInsrtId;

	@Column(name="AUD_INSRT_TMSTP")
	private Timestamp audInsrtTmstp;

	@Column(name="AUD_UPDT_ID")
	private String audUpdtId;

	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;

	@Temporal(TemporalType.DATE)
	@Column(name="RPT_FLD_END_DT")
	private Date rptFldEndDt;

	@Column(name="RPT_FLD_NM")
	private String rptFldNm;

	@Temporal(TemporalType.DATE)
	@Column(name="RPT_FLD_START_DT")
	private Date rptFldStartDt;

	//bi-directional many-to-one association to RptDtl
	@OneToMany(mappedBy="rptFldInfo")
	private List<RptDtl> rptDtls;

	//bi-directional many-to-one association to RefncLkup
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="REFNC_CD", referencedColumnName="REFNC_TYP"),
		@JoinColumn(name="REFNC_TYP", referencedColumnName="REFNC_CD")
		})
	private RefncLkup refncLkup;

	//bi-directional many-to-one association to RptInfo
	@ManyToOne
	@JoinColumn(name="RPT_ID")
	private RptInfo rptInfo;

	public RptFldInfo() {
	}

	public int getRptFldId() {
		return this.rptFldId;
	}

	public void setRptFldId(int rptFldId) {
		this.rptFldId = rptFldId;
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

	public Date getRptFldEndDt() {
		return this.rptFldEndDt;
	}

	public void setRptFldEndDt(Date rptFldEndDt) {
		this.rptFldEndDt = rptFldEndDt;
	}

	public String getRptFldNm() {
		return this.rptFldNm;
	}

	public void setRptFldNm(String rptFldNm) {
		this.rptFldNm = rptFldNm;
	}

	public Date getRptFldStartDt() {
		return this.rptFldStartDt;
	}

	public void setRptFldStartDt(Date rptFldStartDt) {
		this.rptFldStartDt = rptFldStartDt;
	}

	public List<RptDtl> getRptDtls() {
		return this.rptDtls;
	}

	public void setRptDtls(List<RptDtl> rptDtls) {
		this.rptDtls = rptDtls;
	}

	public RptDtl addRptDtl(RptDtl rptDtl) {
		getRptDtls().add(rptDtl);
		rptDtl.setRptFldInfo(this);

		return rptDtl;
	}

	public RptDtl removeRptDtl(RptDtl rptDtl) {
		getRptDtls().remove(rptDtl);
		rptDtl.setRptFldInfo(null);

		return rptDtl;
	}

	public RefncLkup getRefncLkup() {
		return this.refncLkup;
	}

	public void setRefncLkup(RefncLkup refncLkup) {
		this.refncLkup = refncLkup;
	}

	public RptInfo getRptInfo() {
		return this.rptInfo;
	}

	public void setRptInfo(RptInfo rptInfo) {
		this.rptInfo = rptInfo;
	}

}