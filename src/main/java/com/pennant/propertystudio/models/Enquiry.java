//package com.pennant.propertystudio.models;
//
//import java.util.Date;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
//
//@Entity
//@Table(name = "prs_enquiries")
//public class Enquiry {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "enqr_id")
//	private Long id;
//
//	@Column(name = "enqr_date", nullable = false)
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date date;
//
//	@ManyToOne
//	@JoinColumn(name = "enqr_proj_id", nullable = false)
//	private Project project;
//
//	@Column(name = "enqr_fullname", nullable = false, length = 100)
//	private String fullname;
//
//	@Column(name = "enqr_profession", length = 60)
//	private String profession;
//
//	@Column(name = "enqr_local", length = 3)
//	private String local;
//
//	@Column(name = "enqr_mobile", length = 11)
//	private String mobile;
//
//	@Column(name = "enqr_source", length = 4)
//	private String source;
//
//	@ManyToOne
//	@JoinColumn(name = "enqr_empl_id")
//	private Employee employee;
//
//	@Column(name = "enqr_email", length = 100)
//	private String email;
//
//	@Column(name = "enqr_address", length = 255)
//	private String address;
//
//	@Column(name = "enqr_location", length = 50)
//	private String location;
//
//	@Column(name = "enqr_pin", length = 6)
//	private String pin;
//
//	@Column(name = "enqr_city", length = 50)
//	private String city;
//
//	@Column(name = "enqr_luudate")
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date lastUpdatedDate;
//
//	// Getters and Setters
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public Project getProject() {
//		return project;
//	}
//
//	public void setProject(Project project) {
//		this.project = project;
//	}
//
//	public String getFullname() {
//		return fullname;
//	}
//
//	public void setFullname(String fullname) {
//		this.fullname = fullname;
//	}
//
//	public String getProfession() {
//		return profession;
//	}
//
//	public void setProfession(String profession) {
//		this.profession = profession;
//	}
//
//	public String getLocal() {
//		return local;
//	}
//
//	public void setLocal(String local) {
//		this.local = local;
//	}
//
//	public String getMobile() {
//		return mobile;
//	}
//
//	public void setMobile(String mobile) {
//		this.mobile = mobile;
//	}
//
//	public String getSource() {
//		return source;
//	}
//
//	public void setSource(String source) {
//		this.source = source;
//	}
//
//	public Employee getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(Employee employee) {
//		this.employee = employee;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
//
//	public String getPin() {
//		return pin;
//	}
//
//	public void setPin(String pin) {
//		this.pin = pin;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public Date getLastUpdatedDate() {
//		return lastUpdatedDate;
//	}
//
//	public void setLastUpdatedDate(Date lastUpdatedDate) {
//		this.lastUpdatedDate = lastUpdatedDate;
//	}
//
//	@Override
//	public String toString() {
//		return "Enquiry [id=" + id + ", date=" + date + ", project=" + project + ", fullname=" + fullname
//				+ ", profession=" + profession + ", local=" + local + ", mobile=" + mobile + ", source=" + source
//				+ ", email=" + email + ", address=" + address + ", location=" + location + ", pin=" + pin + ", city="
//				+ city + ", lastUpdatedDate=" + lastUpdatedDate + "]";
//	}
//
//}
