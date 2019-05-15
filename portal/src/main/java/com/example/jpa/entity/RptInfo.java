package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the rpt_info database table.
 * 
 */
@Entity
@Table(name="rpt_info")
@NamedQuery(name="RptInfo.findAll", query="SELECT r FROM RptInfo r")
public class RptInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RPT_ID")
	private int rptId;

	@Column(name="AUD_INSRT_ID")
	private String audInsrtId;

	@Column(name="AUD_INSRT_TMSTP")
	private Timestamp audInsrtTmstp;

	@Column(name="AUD_UPDT_ID")
	private String audUpdtId;

	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;

	@Column(name="RPT_NM")
	private String rptNm;

	@Column(name="RPT_STUS")
	private String rptStus;

	//bi-directional many-to-one association to RptDtl
	@OneToMany(mappedBy="rptInfo")
	private List<RptDtl> rptDtls;

	//bi-directional many-to-one association to RptFldInfo
	@OneToMany(mappedBy="rptInfo")
	private List<RptFldInfo> rptFldInfos;

	public RptInfo() {
	}

	public int getRptId() {
		return this.rptId;
	}

	public void setRptId(int rptId) {
		this.rptId = rptId;
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

	public String getRptNm() {
		return this.rptNm;
	}

	public void setRptNm(String rptNm) {
		this.rptNm = rptNm;
	}

	public String getRptStus() {
		return this.rptStus;
	}

	public void setRptStus(String rptStus) {
		this.rptStus = rptStus;
	}

	public List<RptDtl> getRptDtls() {
		return this.rptDtls;
	}

	public void setRptDtls(List<RptDtl> rptDtls) {
		this.rptDtls = rptDtls;
	}

	public RptDtl addRptDtl(RptDtl rptDtl) {
		getRptDtls().add(rptDtl);
		rptDtl.setRptInfo(this);

		return rptDtl;
	}

	public RptDtl removeRptDtl(RptDtl rptDtl) {
		getRptDtls().remove(rptDtl);
		rptDtl.setRptInfo(null);

		return rptDtl;
	}

	public List<RptFldInfo> getRptFldInfos() {
		return this.rptFldInfos;
	}

	public void setRptFldInfos(List<RptFldInfo> rptFldInfos) {
		this.rptFldInfos = rptFldInfos;
	}

	public RptFldInfo addRptFldInfo(RptFldInfo rptFldInfo) {
		getRptFldInfos().add(rptFldInfo);
		rptFldInfo.setRptInfo(this);

		return rptFldInfo;
	}

	public RptFldInfo removeRptFldInfo(RptFldInfo rptFldInfo) {
		getRptFldInfos().remove(rptFldInfo);
		rptFldInfo.setRptInfo(null);

		return rptFldInfo;
	}

}