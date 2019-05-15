package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the usr_info database table.
 * 
 */
@Entity
@Table(name="usr_info")
@NamedQuery(name="UsrInfo.findAll", query="SELECT u FROM UsrInfo u")
public class UsrInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USR_ID")
	private int usrId;

	@Column(name="AUD_INSRT_ID")
	private String audInsrtId;

	@Column(name="AUD_INSRT_TMSTP")
	private Timestamp audInsrtTmstp;

	@Column(name="AUD_UPDT_ID")
	private String audUpdtId;

	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;

	@Column(name="EMP_USR_ID")
	private String empUsrId;

	@Column(name="EMP_USR_NM")
	private String empUsrNm;

	@Temporal(TemporalType.DATE)
	@Column(name="USR_END_DT")
	private Date usrEndDt;

	@Temporal(TemporalType.DATE)
	@Column(name="USR_START_DT")
	private Date usrStartDt;

	//bi-directional many-to-one association to UsrRoleTyp
	@OneToMany(mappedBy="usrInfo")
	private List<UsrRoleTyp> usrRoleTyps;

	public UsrInfo() {
	}

	public int getUsrId() {
		return this.usrId;
	}

	public void setUsrId(int usrId) {
		this.usrId = usrId;
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

	public String getEmpUsrId() {
		return this.empUsrId;
	}

	public void setEmpUsrId(String empUsrId) {
		this.empUsrId = empUsrId;
	}

	public String getEmpUsrNm() {
		return this.empUsrNm;
	}

	public void setEmpUsrNm(String empUsrNm) {
		this.empUsrNm = empUsrNm;
	}

	public Date getUsrEndDt() {
		return this.usrEndDt;
	}

	public void setUsrEndDt(Date usrEndDt) {
		this.usrEndDt = usrEndDt;
	}

	public Date getUsrStartDt() {
		return this.usrStartDt;
	}

	public void setUsrStartDt(Date usrStartDt) {
		this.usrStartDt = usrStartDt;
	}

	public List<UsrRoleTyp> getUsrRoleTyps() {
		return this.usrRoleTyps;
	}

	public void setUsrRoleTyps(List<UsrRoleTyp> usrRoleTyps) {
		this.usrRoleTyps = usrRoleTyps;
	}

	public UsrRoleTyp addUsrRoleTyp(UsrRoleTyp usrRoleTyp) {
		getUsrRoleTyps().add(usrRoleTyp);
		usrRoleTyp.setUsrInfo(this);

		return usrRoleTyp;
	}

	public UsrRoleTyp removeUsrRoleTyp(UsrRoleTyp usrRoleTyp) {
		getUsrRoleTyps().remove(usrRoleTyp);
		usrRoleTyp.setUsrInfo(null);

		return usrRoleTyp;
	}

}