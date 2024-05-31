package com.pennant.propertystudio.models;

import jakarta.persistence.*;

@Entity
@Table(name = "prs_flatproperties")
public class FlatProperty {
	@Id
	@Column(name = "prop_id")
	private Long id;

	@OneToOne
	@MapsId
	@JoinColumn(name = "prop_id")
	private Property property;

	@Column(name = "prop_flat_no")
	private String flatNumber;

	@Override
	public String toString() {
		return "FlatProperty [id=" + id + ", property=" + property + ", flatNumber=" + flatNumber + "]";
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

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

}