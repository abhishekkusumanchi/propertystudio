package com.pennant.propertystudio.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prs_flat_properties")
public class FlatProperty {
	@Id
	@Column(name = "prop_id")
	private Integer id;

	@OneToOne
	@MapsId
	@JoinColumn(name = "prop_id")
	private Property property;

	@Column(name = "prop_flat_no")
	private String flatNumber;

	

}