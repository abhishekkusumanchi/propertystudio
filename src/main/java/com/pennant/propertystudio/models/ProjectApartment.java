//package com.pennant.propertystudio.models;
//
//import java.util.Date;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "prs_project_apartments")
//public class ProjectApartment {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "aprt_id")
//	private Long id;
//
//	@Column(name = "aprt_title", nullable = false, length = 100)
//	private String title;
//
//	@Column(name = "aprt_cdate", nullable = false)
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date creationDate;
//
//	@ManyToOne
//	@JoinColumn(name = "aprt_proj_id")
//	private Project project;
//
//	@Column(name = "aprt_ref_no", length = 20)
//	private String referenceNumber;
//
//	@Column(name = "aprt_status", length = 4)
//	private String status;
//
//	@Override
//	public String toString() {
//		return "ProjectApartment [id=" + id + ", title=" + title + ", creationDate=" + creationDate
//				+ ", referenceNumber=" + referenceNumber + ", status=" + status + "]";
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public Date getCreationDate() {
//		return creationDate;
//	}
//
//	public void setCreationDate(Date creationDate) {
//		this.creationDate = creationDate;
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
//	public String getReferenceNumber() {
//		return referenceNumber;
//	}
//
//	public void setReferenceNumber(String referenceNumber) {
//		this.referenceNumber = referenceNumber;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//}
