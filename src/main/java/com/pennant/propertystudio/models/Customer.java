package com.pennant.propertystudio.models;

import java.util.Date;

import org.apache.catalina.authenticator.jaspic.PersistentProviderRegistrations.Property;

import jakarta.persistence.*;

@Entity
@Table(name = "prs_customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cust_enqr_id", nullable = false)
	private Enquiry enquiry;

	@ManyToOne
	@JoinColumn(name = "cust_prop_id")
	private Property property;

	@Column(name = "cust_firstname", nullable = false)
	private String firstname;

	@Column(name = "cust_lastname", nullable = false)
	private String lastname;

	@Column(name = "cust_email", nullable = false)
	private String email;

	@Column(name = "cust_mobile")
	private String mobile;

	@Column(name = "cust_address")
	private String address;

	@Column(name = "cust_location")
	private String location;

	@Column(name = "cust_pin")
	private String pin;

	@Column(name = "cust_city")
	private String city;

	@Column(name = "cust_luudate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Enquiry getEnquiry() {
		return enquiry;
	}

	public void setEnquiry(Enquiry enquiry) {
		this.enquiry = enquiry;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobile=" + mobile + ", address=" + address + ", location=" + location + ", pin=" + pin + ", city="
				+ city + ", lastUpdatedDate=" + lastUpdatedDate + "]";
	}
}