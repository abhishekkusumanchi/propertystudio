package com.pennant.propertystudio.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "prs_properties")
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prop_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "prop_proj_id")
	private Project project;

	@ManyToOne
	@JoinColumn(name = "prop_cust_id")
	private Customer customer;

	@Column(name = "prop_type")
	private String type;

	@Column(name = "prop_ref_no")
	private String referenceNumber;

	@Column(name = "prop_status")
	private String status;

	@Column(name = "prop_luudate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate;

	@ManyToOne
	@JoinColumn(name = "prop_luausr_id")
	private AdminUser lastUpdatedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public AdminUser getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(AdminUser lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", customer=" + customer + ", type=" + type + ", referenceNumber="
				+ referenceNumber + ", status=" + status + ", lastUpdatedDate=" + lastUpdatedDate + "]";
	}
}
