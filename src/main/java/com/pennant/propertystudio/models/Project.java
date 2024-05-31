package com.pennant.propertystudio.models;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "prs_projects")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "proj_id")
	private Long id;

	@Column(name = "proj_title", nullable = false)
	private String title;

	@ManyToOne
	@JoinColumn(name = "proj_prty_id", nullable = false)
	private ProjectType projectType;

	@Column(name = "proj_location", nullable = false)
	private String location;

	@Column(name = "proj_cdate", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date creationDate;

	@Column(name = "proj_desc")
	private String description;

	@Lob
	@Column(name = "proj_banner")
	private byte[] banner;

	@Column(name = "proj_coordinates")
	private String coordinates;

	@Column(name = "proj_construction_status")
	private String constructionStatus;

	@Column(name = "proj_status")
	private String status;

	@Column(name = "proj_luudate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdatedDate;

	@ManyToOne
	@JoinColumn(name = "proj_luausr_id")
	private AdminUser lastUpdatedBy;

	// Getters and Setters
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

	public ProjectType getProjectType() {
		return projectType;
	}

	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getBanner() {
		return banner;
	}

	public void setBanner(byte[] banner) {
		this.banner = banner;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public String getConstructionStatus() {
		return constructionStatus;
	}

	public void setConstructionStatus(String constructionStatus) {
		this.constructionStatus = constructionStatus;
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
		return "Project [id=" + id + ", title=" + title + ", projectType=" + projectType + ", location=" + location
				+ ", creationDate=" + creationDate + ", description=" + description + ", banner="
				+ Arrays.toString(banner) + ", coordinates=" + coordinates + ", constructionStatus="
				+ constructionStatus + ", status=" + status + ", lastUpdatedDate=" + lastUpdatedDate + "]";
	}

}