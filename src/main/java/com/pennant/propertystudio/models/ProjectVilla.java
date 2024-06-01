//package com.pennant.propertystudio.models;
//
//import java.util.Arrays;
//import java.util.Date;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "prs_project_villas")
//public class ProjectVilla {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "vill_id")
//	private Long id;
//
//	@ManyToOne
//	@JoinColumn(name = "vill_proj_id")
//	private Project project;
//
//	@Column(name = "vill_ref_no", length = 20)
//	private String referenceNumber;
//
//	@Column(name = "vill_cdate")
//	@Temporal(TemporalType.DATE)
//	private Date creationDate;
//
//	@Column(name = "vill_sqft")
//	private Double squareFeet;
//
//	@Column(name = "vill_builtup_area")
//	private Double builtupArea;
//
//	@Lob
//	@Column(name = "vill_banner_photo")
//	private byte[] bannerPhoto;
//
//	@Column(name = "vill_status", length = 4)
//	private String status;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
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
//	public Date getCreationDate() {
//		return creationDate;
//	}
//
//	public void setCreationDate(Date creationDate) {
//		this.creationDate = creationDate;
//	}
//
//	public Double getSquareFeet() {
//		return squareFeet;
//	}
//
//	public void setSquareFeet(Double squareFeet) {
//		this.squareFeet = squareFeet;
//	}
//
//	public Double getBuiltupArea() {
//		return builtupArea;
//	}
//
//	public void setBuiltupArea(Double builtupArea) {
//		this.builtupArea = builtupArea;
//	}
//
//	public byte[] getBannerPhoto() {
//		return bannerPhoto;
//	}
//
//	public void setBannerPhoto(byte[] bannerPhoto) {
//		this.bannerPhoto = bannerPhoto;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//	@Override
//	public String toString() {
//		return "ProjectVilla [id=" + id + ", referenceNumber=" + referenceNumber + ", creationDate=" + creationDate
//				+ ", squareFeet=" + squareFeet + ", builtupArea=" + builtupArea + ", bannerPhoto="
//				+ Arrays.toString(bannerPhoto) + ", status=" + status + "]";
//	}
//}