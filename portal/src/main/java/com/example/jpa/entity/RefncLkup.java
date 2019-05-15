package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the refnc_lkup database table.
 * 
 */
@Entity
@Table(name="refnc_lkup")
@NamedQuery(name="RefncLkup.findAll", query="SELECT r FROM RefncLkup r")
public class RefncLkup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RefncLkupPK id;

	@Column(name="AUD_INSRT_ID")
	private String audInsrtId;

	@Column(name="AUD_INSRT_TMSTP")
	private Timestamp audInsrtTmstp;

	@Column(name="AUD_UPD_ID")
	private String audUpdId;

	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;

	@Column(name="ORDR_NO")
	private int ordrNo;

	@Column(name="REFNC_DESC")
	private String refncDesc;

	@Temporal(TemporalType.DATE)
	@Column(name="REFNC_END_DT")
	private Date refncEndDt;

	@Column(name="REFNC_SL_NO")
	private int refncSlNo;

	@Temporal(TemporalType.DATE)
	@Column(name="REFNC_START_DT")
	private Date refncStartDt;

	//bi-directional many-to-one association to RptFldInfo
	@OneToMany(mappedBy="refncLkup")
	private List<RptFldInfo> rptFldInfos;

	//bi-directional many-to-one association to UsrRoleTyp
	@OneToMany(mappedBy="refncLkup")
	private List<UsrRoleTyp> usrRoleTyps;

	public RefncLkup() {
	}

	public RefncLkupPK getId() {
		return this.id;
	}

	public void setId(RefncLkupPK id) {
		this.id = id;
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

	public String getAudUpdId() {
		return this.audUpdId;
	}

	public void setAudUpdId(String audUpdId) {
		this.audUpdId = audUpdId;
	}

	public Timestamp getAudUpdtTmstp() {
		return this.audUpdtTmstp;
	}

	public void setAudUpdtTmstp(Timestamp audUpdtTmstp) {
		this.audUpdtTmstp = audUpdtTmstp;
	}

	public int getOrdrNo() {
		return this.ordrNo;
	}

	public void setOrdrNo(int ordrNo) {
		this.ordrNo = ordrNo;
	}

	public String getRefncDesc() {
		return this.refncDesc;
	}

	public void setRefncDesc(String refncDesc) {
		this.refncDesc = refncDesc;
	}

	public Date getRefncEndDt() {
		return this.refncEndDt;
	}

	public void setRefncEndDt(Date refncEndDt) {
		this.refncEndDt = refncEndDt;
	}

	public int getRefncSlNo() {
		return this.refncSlNo;
	}

	public void setRefncSlNo(int refncSlNo) {
		this.refncSlNo = refncSlNo;
	}

	public Date getRefncStartDt() {
		return this.refncStartDt;
	}

	public void setRefncStartDt(Date refncStartDt) {
		this.refncStartDt = refncStartDt;
	}

	public List<RptFldInfo> getRptFldInfos() {
		return this.rptFldInfos;
	}

	public void setRptFldInfos(List<RptFldInfo> rptFldInfos) {
		this.rptFldInfos = rptFldInfos;
	}

	public RptFldInfo addRptFldInfo(RptFldInfo rptFldInfo) {
		getRptFldInfos().add(rptFldInfo);
		rptFldInfo.setRefncLkup(this);

		return rptFldInfo;
	}

	public RptFldInfo removeRptFldInfo(RptFldInfo rptFldInfo) {
		getRptFldInfos().remove(rptFldInfo);
		rptFldInfo.setRefncLkup(null);

		return rptFldInfo;
	}

	public List<UsrRoleTyp> getUsrRoleTyps() {
		return this.usrRoleTyps;
	}

	public void setUsrRoleTyps(List<UsrRoleTyp> usrRoleTyps) {
		this.usrRoleTyps = usrRoleTyps;
	}

	public UsrRoleTyp addUsrRoleTyp(UsrRoleTyp usrRoleTyp) {
		getUsrRoleTyps().add(usrRoleTyp);
		usrRoleTyp.setRefncLkup(this);

		return usrRoleTyp;
	}

	public UsrRoleTyp removeUsrRoleTyp(UsrRoleTyp usrRoleTyp) {
		getUsrRoleTyps().remove(usrRoleTyp);
		usrRoleTyp.setRefncLkup(null);

		return usrRoleTyp;
	}

}