package com.pennant.propertystudio.models;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prs_payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pay_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "pay_cust_id", nullable = false)
    private Customer customer;

    @Column(name = "pay_amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "pay_date", nullable = false)
    private Date date;

    @Column(name = "pay_method")
    private String method;

    @Column(name = "pay_status")
    private String status;

    @Column(name = "pay_luudate")
    private Date lastUpdatedDate;
    
    
}
