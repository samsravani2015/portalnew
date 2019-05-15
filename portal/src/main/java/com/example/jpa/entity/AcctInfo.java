package com.example.jpa.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the acct_info database table.
 * 
 */
@Entity
@Table(name="acct_info")
@NamedQuery(name="AcctInfo.findAll", query="SELECT a FROM AcctInfo a")
public class AcctInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCT_ID")
	private int acctId;
	
	@JsonIgnore
	@Temporal(TemporalType.DATE)
	@Column(name="ACCT_END_DT")
	private Date acctEndDt;

	@Column(name="ACCT_NM")
	private String acctNm;

	@JsonIgnore
	@Temporal(TemporalType.DATE)
	@Column(name="ACCT_START_DT")
	private Date acctStartDt;

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

	//bi-directional many-to-one association to AcctPorfolAssc
	//@JsonIgnore
	@OneToMany(mappedBy="acctInfo")
	private List<AcctPorfolAssc> acctPorfolAsscs;

	//bi-directional many-to-one association to RegnAcctAssc
	//@JsonIgnore
	@OneToMany(mappedBy="acctInfo")
	private List<RegnAcctAssc> regnAcctAsscs;

	public AcctInfo() {
	}

	public int getAcctId() {
		return this.acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

	public Date getAcctEndDt() {
		return this.acctEndDt;
	}

	public void setAcctEndDt(Date acctEndDt) {
		this.acctEndDt = acctEndDt;
	}

	public String getAcctNm() {
		return this.acctNm;
	}

	public void setAcctNm(String acctNm) {
		this.acctNm = acctNm;
	}

	public Date getAcctStartDt() {
		return this.acctStartDt;
	}

	public void setAcctStartDt(Date acctStartDt) {
		this.acctStartDt = acctStartDt;
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

	public List<AcctPorfolAssc> getAcctPorfolAsscs() {
		return this.acctPorfolAsscs;
	}

	public void setAcctPorfolAsscs(List<AcctPorfolAssc> acctPorfolAsscs) {
		this.acctPorfolAsscs = acctPorfolAsscs;
	}

	public AcctPorfolAssc addAcctPorfolAssc(AcctPorfolAssc acctPorfolAssc) {
		getAcctPorfolAsscs().add(acctPorfolAssc);
		acctPorfolAssc.setAcctInfo(this);

		return acctPorfolAssc;
	}

	public AcctPorfolAssc removeAcctPorfolAssc(AcctPorfolAssc acctPorfolAssc) {
		getAcctPorfolAsscs().remove(acctPorfolAssc);
		acctPorfolAssc.setAcctInfo(null);

		return acctPorfolAssc;
	}

	public List<RegnAcctAssc> getRegnAcctAsscs() {
		return this.regnAcctAsscs;
	}

	public void setRegnAcctAsscs(List<RegnAcctAssc> regnAcctAsscs) {
		this.regnAcctAsscs = regnAcctAsscs;
	}

	public RegnAcctAssc addRegnAcctAssc(RegnAcctAssc regnAcctAssc) {
		getRegnAcctAsscs().add(regnAcctAssc);
		regnAcctAssc.setAcctInfo(this);

		return regnAcctAssc;
	}

	public RegnAcctAssc removeRegnAcctAssc(RegnAcctAssc regnAcctAssc) {
		getRegnAcctAsscs().remove(regnAcctAssc);
		regnAcctAssc.setAcctInfo(null);

		return regnAcctAssc;
	}

}