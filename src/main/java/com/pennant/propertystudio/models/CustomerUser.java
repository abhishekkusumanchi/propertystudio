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
@Table(name = "prs_customerusers")
public class CustomerUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;

	@ManyToOne
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

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Override
	public String toString() {
		return "CustomerUser [id=" + id + ", email=" + email + ", creationDate=" + creationDate + ", password="
				+ password + ", lastUpdatedDate=" + lastUpdatedDate + "]";
	}

}
