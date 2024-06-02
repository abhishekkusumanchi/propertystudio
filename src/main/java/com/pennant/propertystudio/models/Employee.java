package com.pennant.propertystudio.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "prs_employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "empl_id")
	private Integer id;

	@Column(name = "empl_fullname", nullable = false, length = 70)
	private String fullname;

	@Column(name = "empl_desg", length = 50)
	private String designation;

	@Column(name = "empl_department", length = 50)
	private String department;

	@Column(name = "empl_ref_no", length = 20)
	private String referenceNumber;

	@Column(name = "empl_status", length = 4)
	private String status;

	@Column(name = "empl_ludate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate;

	@ManyToOne
	@JoinColumn(name = "empl_ausr_id")
	private AdminUser lastUpdatedBy;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Enquiry> enquiries;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<SiteVisit> siteVisits;



}