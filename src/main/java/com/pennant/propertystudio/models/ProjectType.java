package com.pennant.propertystudio.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prs_projecttypes")
public class ProjectType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prty_id")
	private Long id;

	@Column(name = "prty_name", nullable = false)
	private String name;

	@Column(name = "prty_desc")
	private String description;

	// Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ProjectType [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

}
