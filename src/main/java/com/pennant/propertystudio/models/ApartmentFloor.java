package com.pennant.propertystudio.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
@Table(name = "prs_apartment_floors")
public class ApartmentFloor {	
	@Id
	@Column(name = "aprf_floorindex", insertable = false, updatable = false)
    private int floorIndex;

    @Column(name = "aprf_floorplan")
    private byte[] floorPlan;

    @Column(name = "aprf_completion_status", length = 4)
    private String completionStatus;

    @Column(name = "aprf_luudate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedDate;

    @Id
    @ManyToOne
    @JoinColumn(name = "proj_id", nullable = false) // Specify the foreign key reference and NOT NULL constraint
    private Project project;

    @ManyToOne
    @JoinColumn(name = "aprf_ausr_id")
    private AdminUser lastUpdatedBy;
}
