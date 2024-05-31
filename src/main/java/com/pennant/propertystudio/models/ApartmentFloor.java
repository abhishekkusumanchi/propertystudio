//package com.pennant.propertystudio.models;
//
//import java.util.Arrays;
//import java.util.Date;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.EmbeddedId;
//import jakarta.persistence.Entity;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.Lob;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
//
//@Entity
//@Table(name = "prs_apartmentfloors")
//public class ApartmentFloor {
//	@EmbeddedId
//	private ApartmentFloorId id;
//
//	@Lob
//	@Column(name = "aprf_floorplan")
//	private byte[] floorPlan;
//
//	@Column(name = "aprf_completion_status")
//	private String completionStatus;
//
//	@Column(name = "aprf_luudate")
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date lastUpdatedDate;
//
//	@ManyToOne
//	@JoinColumn(name = "aprf_ausr_id")
//	private AdminUser lastUpdatedBy;
//
//	public ApartmentFloorId getId() {
//		return id;
//	}
//
//	public void setId(ApartmentFloorId id) {
//		this.id = id;
//	}
//
//	public byte[] getFloorPlan() {
//		return floorPlan;
//	}
//
//	public void setFloorPlan(byte[] floorPlan) {
//		this.floorPlan = floorPlan;
//	}
//
//	public String getCompletionStatus() {
//		return completionStatus;
//	}
//
//	public void setCompletionStatus(String completionStatus) {
//		this.completionStatus = completionStatus;
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
//	public AdminUser getLastUpdatedBy() {
//		return lastUpdatedBy;
//	}
//
//	public void setLastUpdatedBy(AdminUser lastUpdatedBy) {
//		this.lastUpdatedBy = lastUpdatedBy;
//	}
//
//	@Override
//	public String toString() {
//		return "ApartmentFloor [floorPlan=" + Arrays.toString(floorPlan) + ", completionStatus=" + completionStatus
//				+ ", lastUpdatedDate=" + lastUpdatedDate + "]";
//	}
//}
