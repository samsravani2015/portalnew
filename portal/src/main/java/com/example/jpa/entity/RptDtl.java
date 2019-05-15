package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the rpt_dtls database table.
 * 
 */
@Entity
@Table(name="rpt_dtls")
@NamedQuery(name="RptDtl.findAll", query="SELECT r FROM RptDtl r")
public class RptDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RPT_DTLS_ID")
	private int rptDtlsId;

	@Column(name="REFNC_CD")
	private String refncCd;

	@Column(name="REFNC_TYP")
	private String refncTyp;

	@Column(name="REPT_DTLS")
	private String reptDtls;

	@Temporal(TemporalType.DATE)
	@Column(name="RPT_FRM_DT")
	private Date rptFrmDt;

	@Temporal(TemporalType.DATE)
	@Column(name="RPT_TO_DT")
	private Date rptToDt;

	//bi-directional many-to-one association to AcctPorfolAssc
	@ManyToOne
	@JoinColumn(name="ACCT_PORFOL_ASSC_ID")
	private AcctPorfolAssc acctPorfolAssc;

	//bi-directional many-to-one association to PorfolPrgmAssc
	@ManyToOne
	@JoinColumn(name="PORFOL_PRGM_ASSC_ID")
	private PorfolPrgmAssc porfolPrgmAssc;

	//bi-directional many-to-one association to PrgmProjAssc
	@ManyToOne
	@JoinColumn(name="PRGM_PROJ_ASSC_ID")
	private PrgmProjAssc prgmProjAssc;

	//bi-directional many-to-one association to RegnAcctAssc
	@ManyToOne
	@JoinColumn(name="REGN_ACCT_ASSC_ID")
	private RegnAcctAssc regnAcctAssc;

	//bi-directional many-to-one association to RptFldInfo
	@ManyToOne
	@JoinColumn(name="RPT_FLD_ID")
	private RptFldInfo rptFldInfo;

	//bi-directional many-to-one association to RptInfo
	@ManyToOne
	@JoinColumn(name="RPT_ID")
	private RptInfo rptInfo;

	public RptDtl() {
	}

	public int getRptDtlsId() {
		return this.rptDtlsId;
	}

	public void setRptDtlsId(int rptDtlsId) {
		this.rptDtlsId = rptDtlsId;
	}

	public String getRefncCd() {
		return this.refncCd;
	}

	public void setRefncCd(String refncCd) {
		this.refncCd = refncCd;
	}

	public String getRefncTyp() {
		return this.refncTyp;
	}

	public void setRefncTyp(String refncTyp) {
		this.refncTyp = refncTyp;
	}

	public String getReptDtls() {
		return this.reptDtls;
	}

	public void setReptDtls(String reptDtls) {
		this.reptDtls = reptDtls;
	}

	public Date getRptFrmDt() {
		return this.rptFrmDt;
	}

	public void setRptFrmDt(Date rptFrmDt) {
		this.rptFrmDt = rptFrmDt;
	}

	public Date getRptToDt() {
		return this.rptToDt;
	}

	public void setRptToDt(Date rptToDt) {
		this.rptToDt = rptToDt;
	}

	public AcctPorfolAssc getAcctPorfolAssc() {
		return this.acctPorfolAssc;
	}

	public void setAcctPorfolAssc(AcctPorfolAssc acctPorfolAssc) {
		this.acctPorfolAssc = acctPorfolAssc;
	}

	public PorfolPrgmAssc getPorfolPrgmAssc() {
		return this.porfolPrgmAssc;
	}

	public void setPorfolPrgmAssc(PorfolPrgmAssc porfolPrgmAssc) {
		this.porfolPrgmAssc = porfolPrgmAssc;
	}

	public PrgmProjAssc getPrgmProjAssc() {
		return this.prgmProjAssc;
	}

	public void setPrgmProjAssc(PrgmProjAssc prgmProjAssc) {
		this.prgmProjAssc = prgmProjAssc;
	}

	public RegnAcctAssc getRegnAcctAssc() {
		return this.regnAcctAssc;
	}

	public void setRegnAcctAssc(RegnAcctAssc regnAcctAssc) {
		this.regnAcctAssc = regnAcctAssc;
	}

	public RptFldInfo getRptFldInfo() {
		return this.rptFldInfo;
	}

	public void setRptFldInfo(RptFldInfo rptFldInfo) {
		this.rptFldInfo = rptFldInfo;
	}

	public RptInfo getRptInfo() {
		return this.rptInfo;
	}

	public void setRptInfo(RptInfo rptInfo) {
		this.rptInfo = rptInfo;
	}

}