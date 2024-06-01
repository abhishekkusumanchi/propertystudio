package com.pennant.propertystudio.models;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "prs_project_commercial_complexes")
public class ProjectCommercialComplex {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cplx_id")
	private Long id;

	@Column(name = "cplx_title", nullable = false, length = 100)
	private String title;

	@ManyToOne
	@JoinColumn(name = "cplx_proj_id")
	private Project project;

	@Column(name = "cplx_ref_no", length = 20)
	private String referenceNumber;

	@Column(name = "cplx_cdate")
	@Temporal(TemporalType.DATE)
	private Date creationDate;

	@Column(name = "cplx_sqft")
	private Double squareFeet;

	@Column(name = "cplx_builtup_area")
	private Double builtupArea;

	@Lob
	@Column(name = "cplx_banner_photo")
	private byte[] bannerPhoto;

	@Column(name = "cplx_status", length = 4)
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Double getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(Double squareFeet) {
		this.squareFeet = squareFeet;
	}

	public Double getBuiltupArea() {
		return builtupArea;
	}

	public void setBuiltupArea(Double builtupArea) {
		this.builtupArea = builtupArea;
	}

	public byte[] getBannerPhoto() {
		return bannerPhoto;
	}

	public void setBannerPhoto(byte[] bannerPhoto) {
		this.bannerPhoto = bannerPhoto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ProjectCommercialComplex [id=" + id + ", title=" + title + ", referenceNumber=" + referenceNumber
				+ ", creationDate=" + creationDate + ", squareFeet=" + squareFeet + ", builtupArea=" + builtupArea
				+ ", bannerPhoto=" + Arrays.toString(bannerPhoto) + ", status=" + status + "]";
	}
}
