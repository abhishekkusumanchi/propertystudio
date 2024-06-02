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
@Table(name = "prs_enquiries")
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "enqr_id")
	private Integer id;

	@Column(name = "enqr_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	@ManyToOne
	@JoinColumn(name = "enqr_proj_id", nullable = false)
	private Project project;

	@Column(name = "enqr_fullname", nullable = false, length = 100)
	private String fullname;

	@Column(name = "enqr_profession", length = 60)
	private String profession;

	@Column(name = "enqr_local", length = 3)
	private String local;

	@Column(name = "enqr_mobile", length = 11)
	private String mobile;

	@Column(name = "enqr_source", length = 4)
	private String source;

	@ManyToOne
	@JoinColumn(name = "enqr_empl_id")
	private Employee employee;

	@Column(name = "enqr_email", length = 100)
	private String email;

	@Column(name = "enqr_address", length = 255)
	private String address;

	@Column(name = "enqr_location", length = 50)
	private String location;

	@Column(name = "enqr_pin", length = 6)
	private String pin;

	@Column(name = "enqr_city", length = 50)
	private String city;

	@Column(name = "enqr_luudate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate;

	

}
