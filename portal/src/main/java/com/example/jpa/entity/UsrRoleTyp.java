package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the usr_role_typ database table.
 * 
 */
@Entity
@Table(name="usr_role_typ")
@NamedQuery(name="UsrRoleTyp.findAll", query="SELECT u FROM UsrRoleTyp u")
public class UsrRoleTyp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USR_ROLE_ID")
	private int usrRoleId;

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

	//bi-directional many-to-one association to RefncLkup
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="REFNC_CD", referencedColumnName="REFNC_TYP"),
		@JoinColumn(name="REFNC_TYP", referencedColumnName="REFNC_CD")
		})
	private RefncLkup refncLkup;

	//bi-directional many-to-one association to UsrInfo
	@ManyToOne
	@JoinColumn(name="USR_ID")
	private UsrInfo usrInfo;

	public UsrRoleTyp() {
	}

	public int getUsrRoleId() {
		return this.usrRoleId;
	}

	public void setUsrRoleId(int usrRoleId) {
		this.usrRoleId = usrRoleId;
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

	public RefncLkup getRefncLkup() {
		return this.refncLkup;
	}

	public void setRefncLkup(RefncLkup refncLkup) {
		this.refncLkup = refncLkup;
	}

	public UsrInfo getUsrInfo() {
		return this.usrInfo;
	}

	public void setUsrInfo(UsrInfo usrInfo) {
		this.usrInfo = usrInfo;
	}

}