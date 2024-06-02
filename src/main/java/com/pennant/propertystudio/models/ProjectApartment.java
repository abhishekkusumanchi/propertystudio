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
@Table(name = "prs_project_apartments")
public class ProjectApartment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aprt_id")
	private Integer id;

	@Column(name = "aprt_title", nullable = false, length = 100)
	private String title;

	@Column(name = "aprt_cdate", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	@ManyToOne
	@JoinColumn(name = "aprt_proj_id")
	private Project project;

	@Column(name = "aprt_ref_no", length = 20)
	private String referenceNumber;

	@Column(name = "aprt_status", length = 4)
	private String status;

	
}
