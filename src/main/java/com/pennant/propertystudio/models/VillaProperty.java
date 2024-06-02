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


}
