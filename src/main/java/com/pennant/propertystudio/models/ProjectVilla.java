package com.pennant.propertystudio.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "prs_project_villas")
public class ProjectVilla {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vill_id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "vill_proj_id")
	private Project project;

	@Column(name = "vill_ref_no", length = 20)
	private String referenceNumber;

	@Column(name = "vill_cdate")
	@Temporal(TemporalType.DATE)
	private Date creationDate;

	@Column(name = "vill_sqft")
	private Double squareFeet;

	@Column(name = "vill_builtup_area")
	private Double builtupArea;

	@Lob
	@Column(name = "vill_banner_photo")
	private byte[] bannerPhoto;

	@Column(name = "vill_status", length = 4)
	private String status;

	
}