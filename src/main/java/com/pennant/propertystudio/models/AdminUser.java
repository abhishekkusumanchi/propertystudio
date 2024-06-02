package com.pennant.propertystudio.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "prs_admin_users")
public class AdminUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ausr_id")
	private Integer id;

	@Column(name = "ausr_username", nullable = false, length = 60)
	private String username;

	@Column(name = "ausr_fullname", length = 70)
	private String fullname;

	@Column(name = "ausr_pwd", nullable = false, length = 100)
	private String password;

	@Column(name = "ausr_cdate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;

	@Column(name = "ausr_lastpwdreset")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastPasswordReset;

	@Column(name = "ausr_status", length = 4)
	private String status;

	@OneToMany(mappedBy = "lastUpdatedBy")
    private List<Employee> employees;

	@OneToMany(mappedBy = "lastUpdatedBy")
    private List<Project> projects;
    
    @OneToMany(mappedBy = "lastUpdatedBy")
    private List<Property> updatedProperties;
    
    @ManyToOne
    @JoinColumn(name = "ausr_luausr_id")
    private AdminUser lastUpdatedBy;
    

	

}
