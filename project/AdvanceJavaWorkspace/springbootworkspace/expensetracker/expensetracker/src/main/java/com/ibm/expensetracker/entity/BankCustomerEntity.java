package com.ibm.expensetracker.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="bank_cust")
@NoArgsConstructor
@AllArgsConstructor

public class BankCustomerEntity {
	@Id   //primary key and not null
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //auto increment
	private Long id;
	
	private String name;  
	
	
	private String surName;   
	
	
	private String email;
	
	private String phoneNo;
	
	private String panCard;
	
}
