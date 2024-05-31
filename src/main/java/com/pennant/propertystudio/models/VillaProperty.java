package com.pennant.propertystudio.models;

import jakarta.persistence.*;

@Entity
@Table(name = "prs_villaproperties")
public class VillaProperty {
	@Id
	@Column(name = "prop_id")
	private Long id;

	@OneToOne
	@MapsId
	@JoinColumn(name = "prop_id")
	private Property property;

	@Column(name = "prop_vill_no")
	private String villaNumber;

	@Override
	public String toString() {
		return "VillaProperty [id=" + id + ", property=" + property + ", villaNumber=" + villaNumber + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public String getVillaNumber() {
		return villaNumber;
	}

	public void setVillaNumber(String villaNumber) {
		this.villaNumber = villaNumber;
	}
}
