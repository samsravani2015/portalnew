package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the regn_acct_assc database table.
 * 
 */
@Entity
@Table(name="regn_acct_assc")
@NamedQuery(name="RegnAcctAssc.findAll", query="SELECT r FROM RegnAcctAssc r")
public class RegnAcctAssc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REGN_ACCT_ASSC_ID")
	private int regnAcctAsscId;

	@Column(name="AUD_INSRT_ID")
	private String audInsrtId;

	@Column(name="AUD_INSRT_TMSTP")
	private Timestamp audInsrtTmstp;

	@Column(name="AUD_UPDT_ID")
	private String audUpdtId;

	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DT")
	private Date endDt;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DT")
	private Date startDt;

	//bi-directional many-to-one association to AcctInfo
	@ManyToOne
	@JoinColumn(name="ACCT_ID")
	private AcctInfo acctInfo;

	//bi-directional many-to-one association to RegnInfo
	@ManyToOne
	@JoinColumn(name="REGN_ID")
	private RegnInfo regnInfo;

	//bi-directional many-to-one association to RptDtl
	@OneToMany(mappedBy="regnAcctAssc")
	private List<RptDtl> rptDtls;

	public RegnAcctAssc() {
	}

	public int getRegnAcctAsscId() {
		return this.regnAcctAsscId;
	}

	public void setRegnAcctAsscId(int regnAcctAsscId) {
		this.regnAcctAsscId = regnAcctAsscId;
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

	public RegnInfo getRegnInfo() {
		return this.regnInfo;
	}

	public void setRegnInfo(RegnInfo regnInfo) {
		this.regnInfo = regnInfo;
	}

	public List<RptDtl> getRptDtls() {
		return this.rptDtls;
	}

	public void setRptDtls(List<RptDtl> rptDtls) {
		this.rptDtls = rptDtls;
	}

	public RptDtl addRptDtl(RptDtl rptDtl) {
		getRptDtls().add(rptDtl);
		rptDtl.setRegnAcctAssc(this);

		return rptDtl;
	}

	public RptDtl removeRptDtl(RptDtl rptDtl) {
		getRptDtls().remove(rptDtl);
		rptDtl.setRegnAcctAssc(null);

		return rptDtl;
	}

}