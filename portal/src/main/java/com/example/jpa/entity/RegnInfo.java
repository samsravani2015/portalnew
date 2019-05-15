package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the regn_info database table.
 * 
 */
@Entity
@Table(name="regn_info")
@NamedQuery(name="RegnInfo.findAll", query="SELECT r FROM RegnInfo r")
public class RegnInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REGN_ID")
	private int regnId;

	@Column(name="AUD_INSRT_ID")
	private String audInsrtId;

	@Column(name="AUD_INSRT_TMSTP")
	private Timestamp audInsrtTmstp;

	@Column(name="AUD_UPDT_ID")
	private String audUpdtId;

	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;

	@Temporal(TemporalType.DATE)
	@Column(name="REGN_END_DT")
	private Date regnEndDt;

	@Column(name="REGN_NM")
	private String regnNm;

	@Temporal(TemporalType.DATE)
	@Column(name="REGN_START_DT")
	private Date regnStartDt;

	//bi-directional many-to-one association to RegnAcctAssc
	@OneToMany(mappedBy="regnInfo")
	private List<RegnAcctAssc> regnAcctAsscs;

	public RegnInfo() {
	}

	public int getRegnId() {
		return this.regnId;
	}

	public void setRegnId(int regnId) {
		this.regnId = regnId;
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

	public Date getRegnEndDt() {
		return this.regnEndDt;
	}

	public void setRegnEndDt(Date regnEndDt) {
		this.regnEndDt = regnEndDt;
	}

	public String getRegnNm() {
		return this.regnNm;
	}

	public void setRegnNm(String regnNm) {
		this.regnNm = regnNm;
	}

	public Date getRegnStartDt() {
		return this.regnStartDt;
	}

	public void setRegnStartDt(Date regnStartDt) {
		this.regnStartDt = regnStartDt;
	}

	public List<RegnAcctAssc> getRegnAcctAsscs() {
		return this.regnAcctAsscs;
	}

	public void setRegnAcctAsscs(List<RegnAcctAssc> regnAcctAsscs) {
		this.regnAcctAsscs = regnAcctAsscs;
	}

	public RegnAcctAssc addRegnAcctAssc(RegnAcctAssc regnAcctAssc) {
		getRegnAcctAsscs().add(regnAcctAssc);
		regnAcctAssc.setRegnInfo(this);

		return regnAcctAssc;
	}

	public RegnAcctAssc removeRegnAcctAssc(RegnAcctAssc regnAcctAssc) {
		getRegnAcctAsscs().remove(regnAcctAssc);
		regnAcctAssc.setRegnInfo(null);

		return regnAcctAssc;
	}

}