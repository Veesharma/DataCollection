package com.varun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_CASES")
@Data
public class DcCases {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CASE_ID")
	Integer caseId;
	
	@Column(name = "CASE_NUM")
	Integer caseNum;
	
	@Column(name = "APP_ID")
	Integer appId;
	
	@Column(name = "PLAN_ID")
	Integer planId;
	
}
