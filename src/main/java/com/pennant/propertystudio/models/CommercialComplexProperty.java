//package com.pennant.propertystudio.models;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "prs_commercialcomplexproperties")
//public class CommercialComplexProperty {
//	@Id
//	@Column(name = "prop_id")
//	private Long id;
//
//	@OneToOne
//	@MapsId
//	@JoinColumn(name = "prop_id")
//	private Property property;
//
//	@Column(name = "prop_blck_no")
//	private String blockNumber;
//
//	@Override
//	public String toString() {
//		return "CommercialComplexProperty [id=" + id + ", property=" + property + ", blockNumber=" + blockNumber + "]";
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public Property getProperty() {
//		return property;
//	}
//
//	public void setProperty(Property property) {
//		this.property = property;
//	}
//
//	public String getBlockNumber() {
//		return blockNumber;
//	}
//
//	public void setBlockNumber(String blockNumber) {
//		this.blockNumber = blockNumber;
//	}
//}
