package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the prgm_proj_assc database table.
 * 
 */
@Entity
@Table(name="prgm_proj_assc")
@NamedQuery(name="PrgmProjAssc.findAll", query="SELECT p FROM PrgmProjAssc p")
public class PrgmProjAssc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRGM_PROJ_ASSC_ID")
	private int prgmProjAsscId;

	@Column(name="AUD_INSRT_ID")
	private String audInsrtId;

	@Column(name="AUD_INSRT_TMSTP")
	private Timestamp audInsrtTmstp;

	@Column(name="AUD_UPDT_ID")
	private String audUpdtId;

	@Column(name="AUD_UPDT_TMSTP")
	private Timestamp audUpdtTmstp;

	@Column(name="CURR_PHS")
	private String currPhs;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DT")
	private Date endDt;

	@Lob
	@Column(name="MIL_STN_DEL")
	private String milStnDel;

	@Lob
	@Column(name="MIL_STN_PLN")
	private String milStnPln;

	@Column(name="OFF_FTE")
	private int offFte;

	@Column(name="ON_FTE")
	private int onFte;

	@Lob
	private String scop;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DT")
	private Date startDt;

	@Lob
	@Column(name="VAL_ADDS")
	private String valAdds;

	//bi-directional many-to-one association to PrgmInfo
	@ManyToOne
	@JoinColumn(name="PRGM_ID")
	private PrgmInfo prgmInfo;

	//bi-directional many-to-one association to ProjInfo
	@ManyToOne
	@JoinColumn(name="PROJ_ID")
	private ProjInfo projInfo;

	//bi-directional many-to-one association to RptDtl
	@OneToMany(mappedBy="prgmProjAssc")
	private List<RptDtl> rptDtls;

	public PrgmProjAssc() {
	}

	public int getPrgmProjAsscId() {
		return this.prgmProjAsscId;
	}

	public void setPrgmProjAsscId(int prgmProjAsscId) {
		this.prgmProjAsscId = prgmProjAsscId;
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

	public String getCurrPhs() {
		return this.currPhs;
	}

	public void setCurrPhs(String currPhs) {
		this.currPhs = currPhs;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public String getMilStnDel() {
		return this.milStnDel;
	}

	public void setMilStnDel(String milStnDel) {
		this.milStnDel = milStnDel;
	}

	public String getMilStnPln() {
		return this.milStnPln;
	}

	public void setMilStnPln(String milStnPln) {
		this.milStnPln = milStnPln;
	}

	public int getOffFte() {
		return this.offFte;
	}

	public void setOffFte(int offFte) {
		this.offFte = offFte;
	}

	public int getOnFte() {
		return this.onFte;
	}

	public void setOnFte(int onFte) {
		this.onFte = onFte;
	}

	public String getScop() {
		return this.scop;
	}

	public void setScop(String scop) {
		this.scop = scop;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public String getValAdds() {
		return this.valAdds;
	}

	public void setValAdds(String valAdds) {
		this.valAdds = valAdds;
	}

	public PrgmInfo getPrgmInfo() {
		return this.prgmInfo;
	}

	public void setPrgmInfo(PrgmInfo prgmInfo) {
		this.prgmInfo = prgmInfo;
	}

	public ProjInfo getProjInfo() {
		return this.projInfo;
	}

	public void setProjInfo(ProjInfo projInfo) {
		this.projInfo = projInfo;
	}

	public List<RptDtl> getRptDtls() {
		return this.rptDtls;
	}

	public void setRptDtls(List<RptDtl> rptDtls) {
		this.rptDtls = rptDtls;
	}

	public RptDtl addRptDtl(RptDtl rptDtl) {
		getRptDtls().add(rptDtl);
		rptDtl.setPrgmProjAssc(this);

		return rptDtl;
	}

	public RptDtl removeRptDtl(RptDtl rptDtl) {
		getRptDtls().remove(rptDtl);
		rptDtl.setPrgmProjAssc(null);

		return rptDtl;
	}

}