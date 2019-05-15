package com.example.jpa.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the refnc_lkup database table.
 * 
 */
@Embeddable
public class RefncLkupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REFNC_CD")
	private String refncCd;

	@Column(name="REFNC_TYP")
	private String refncTyp;

	public RefncLkupPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RefncLkupPK)) {
			return false;
		}
		RefncLkupPK castOther = (RefncLkupPK)other;
		return 
			this.refncCd.equals(castOther.refncCd)
			&& this.refncTyp.equals(castOther.refncTyp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.refncCd.hashCode();
		hash = hash * prime + this.refncTyp.hashCode();
		
		return hash;
	}
}