package com.pennant.propertystudio.models;

import java.util.Date;

import org.springframework.data.geo.Point;

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
@Table(name = "prs_projects")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "proj_id")
	private Integer id;

	@Column(name = "proj_title", nullable = false, length = 100)
	private String title;

	@ManyToOne
	@JoinColumn(name = "proj_prty_id", nullable = false)
	private ProjectType projectType;

	@Column(name = "proj_location", nullable = false, length = 100)
	private String location;

	@Column(name = "proj_cdate", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date creationDate;

	@Column(name = "proj_desc", length = 255)
	private String description;

	@Lob
	@Column(name = "proj_banner")
	private byte[] banner;

	@Column(name = "proj_coordinates")
	private Point coordinates;

	@Column(name = "proj_construction_status", length = 4)
	private String constructionStatus;

	@Column(name = "proj_status", length = 4)
	private String status;

	@Column(name = "proj_luudate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate;

	@ManyToOne
	@JoinColumn(name = "proj_luausr_id")
	private AdminUser lastUpdatedBy;



}