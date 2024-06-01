package com.pennant.propertystudio.models;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "prs_apartment_floors")
public class ApartmentFloor {

	@Column(name = "proj_id", nullable = false)
    private Short projectId;

    @Column(name = "aprf_floorplan")
    private byte[] floorPlan;

    @Column(name = "aprf_completion_status", length = 4)
    private String completionStatus;

    @Column(name = "aprf_luudate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;

    @ManyToOne
    @JoinColumn(name = "proj_id", referencedColumnName = "proj_id", nullable = false) // Specify the foreign key reference and NOT NULL constraint
    private Project project;

    @ManyToOne
    @JoinColumn(name = "aprf_ausr_id")
    private AdminUser lastUpdatedBy;

    // Constructors, getters, and setters

    public ApartmentFloorId getId() {
        return id;
    }

    public void setId(ApartmentFloorId id) {
        this.id = id;
    }

    public byte[] getFloorPlan() {
        return floorPlan;
    }

    public void setFloorPlan(byte[] floorPlan) {
        this.floorPlan = floorPlan;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public AdminUser getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(AdminUser lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
