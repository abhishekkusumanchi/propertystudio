package com.pennant.propertystudio.models;

import java.util.Arrays;
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
@Table(name = "prs_project_commercial_complexes")
public class ProjectCommercialComplex {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cplx_id")
	private Integer id;

	@Column(name = "cplx_title", nullable = false, length = 100)
	private String title;

	@ManyToOne
	@JoinColumn(name = "cplx_proj_id")
	private Project project;

	@Column(name = "cplx_ref_no", length = 20)
	private String referenceNumber;

	@Column(name = "cplx_cdate")
	@Temporal(TemporalType.DATE)
	private Date creationDate;

	@Column(name = "cplx_sqft")
	private Double squareFeet;

	@Column(name = "cplx_builtup_area")
	private Double builtupArea;

	@Lob
	@Column(name = "cplx_banner_photo")
	private byte[] bannerPhoto;

	@Column(name = "cplx_status", length = 4)
	private String status;

	
}
