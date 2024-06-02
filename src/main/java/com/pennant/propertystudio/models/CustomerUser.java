package com.pennant.propertystudio.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "prs_customerusers")
public class CustomerUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;

	@OneToOne
	@JoinColumn(name = "user_cust_id")
	private Customer customer;

	@Column(name = "user_email", nullable = false)
	private String email;

	@Column(name = "user_cdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	@Column(name = "user_pwd", nullable = false)
	private String password;

	@Column(name = "user_luudate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate;

	
}
