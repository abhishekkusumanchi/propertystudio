package com.pennant.propertystudio.models;

import jakarta.persistence.*;

@Entity
@Table(name = "prs_commercial_complex_properties")
public class CommercialComplexProperty {
	@Id
	@Column(name = "prop_id")
	private Integer id;

	@OneToOne
	@MapsId
	@JoinColumn(name = "prop_id")
	private Property property;

	@Column(name = "prop_blck_no")
	private String blockNumber;

}
