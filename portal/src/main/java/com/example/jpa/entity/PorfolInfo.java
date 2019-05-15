package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the porfol_info database table.
 * 
 */
@Entity
@Table(name="porfol_info")
@NamedQuery(name="PorfolInfo.findAll", query="SELECT p FROM PorfolInfo p")
public class PorfolInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PORFOL_ID")
	private int porfolId;

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

	@Column(name="PORFOL_NM")
	private String porfolNm;

	//bi-directional many-to-one association to AcctPorfolAssc
	@JsonIgnore
	@OneToMany(mappedBy="porfolInfo")
	private List<AcctPorfolAssc> acctPorfolAsscs;

	//bi-directional many-to-one association to PorfolPrgmAssc
	@JsonIgnore
	@OneToMany(mappedBy="porfolInfo")
	private List<PorfolPrgmAssc> porfolPrgmAsscs;

	public PorfolInfo() {
	}

	public int getPorfolId() {
		return this.porfolId;
	}

	public void setPorfolId(int porfolId) {
		this.porfolId = porfolId;
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

	public String getPorfolNm() {
		return this.porfolNm;
	}

	public void setPorfolNm(String porfolNm) {
		this.porfolNm = porfolNm;
	}

	public List<AcctPorfolAssc> getAcctPorfolAsscs() {
		return this.acctPorfolAsscs;
	}

	public void setAcctPorfolAsscs(List<AcctPorfolAssc> acctPorfolAsscs) {
		this.acctPorfolAsscs = acctPorfolAsscs;
	}

	public AcctPorfolAssc addAcctPorfolAssc(AcctPorfolAssc acctPorfolAssc) {
		getAcctPorfolAsscs().add(acctPorfolAssc);
		acctPorfolAssc.setPorfolInfo(this);

		return acctPorfolAssc;
	}

	public AcctPorfolAssc removeAcctPorfolAssc(AcctPorfolAssc acctPorfolAssc) {
		getAcctPorfolAsscs().remove(acctPorfolAssc);
		acctPorfolAssc.setPorfolInfo(null);

		return acctPorfolAssc;
	}

	public List<PorfolPrgmAssc> getPorfolPrgmAsscs() {
		return this.porfolPrgmAsscs;
	}

	public void setPorfolPrgmAsscs(List<PorfolPrgmAssc> porfolPrgmAsscs) {
		this.porfolPrgmAsscs = porfolPrgmAsscs;
	}

	public PorfolPrgmAssc addPorfolPrgmAssc(PorfolPrgmAssc porfolPrgmAssc) {
		getPorfolPrgmAsscs().add(porfolPrgmAssc);
		porfolPrgmAssc.setPorfolInfo(this);

		return porfolPrgmAssc;
	}

	public PorfolPrgmAssc removePorfolPrgmAssc(PorfolPrgmAssc porfolPrgmAssc) {
		getPorfolPrgmAsscs().remove(porfolPrgmAssc);
		porfolPrgmAssc.setPorfolInfo(null);

		return porfolPrgmAssc;
	}

}