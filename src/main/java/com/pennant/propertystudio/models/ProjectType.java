package com.pennant.propertystudio.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "prs_project_types")
public class ProjectType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prty_id")
	private Integer id;
	
	 @Column(name = "prty_name", nullable = false, length = 100) 
	 private String name;
	 
	 @Column(name = "prty_desc", length = 255)
	 private String description;
	 
	 @OneToMany(mappedBy = "projectType")
	 private List<Project> projects;
	

	
}
