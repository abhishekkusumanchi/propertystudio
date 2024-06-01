package com.pennant.propertystudio.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Property> getUpdatedProperties() {
		return updatedProperties;
	}

	public void setUpdatedProperties(List<Property> updatedProperties) {
		this.updatedProperties = updatedProperties;
	}

	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastPasswordReset() {
		return lastPasswordReset;
	}

	public void setLastPasswordReset(Date lastPasswordReset) {
		this.lastPasswordReset = lastPasswordReset;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



}
