package com.pennant.propertystudio.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "prs_properties")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prop_id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "prop_proj_id")
	private Project project;
	
	@ManyToOne
    @JoinColumn(name = "prty_id")
    private ProjectType projectType;

	@ManyToOne
	@JoinColumn(name = "prop_cust_id")
	private Customer customer;

	@Column(name = "prop_type", length = 4)
	private String type;

	@Column(name = "prop_ref_no", length = 20)
	private String referenceNumber;

	@Column(name = "prop_status", length = 5)
	private String status;

	@Column(name = "prop_luudate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate;

	@ManyToOne
	@JoinColumn(name = "prop_luausr_id")
	private AdminUser lastUpdatedBy;


}
