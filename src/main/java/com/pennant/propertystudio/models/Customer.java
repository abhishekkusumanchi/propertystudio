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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "prs_customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "cust_enqr_id", nullable = false)
	private Enquiry enquiry;

	@OneToOne
	@JoinColumn(name = "cust_prop_id")
	private Property property;

	@Column(name = "cust_firstname", nullable = false, length = 50)
	private String firstname;

	@Column(name = "cust_lastname", nullable = false, length = 50)
	private String lastname;

	@Column(name = "cust_email", nullable = false, length = 100)
	private String email;

	@Column(name = "cust_mobile", length = 11)
	private String mobile;

	@Column(name = "cust_address", length = 255)
	private String address;

	@Column(name = "cust_location", length = 50)
	private String location;

	@Column(name = "cust_pin", length = 6)
	private String pin;

	@Column(name = "cust_city", length = 50)
	private String city;

	@Column(name = "cust_luudate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Payment> paymentHistory;

}