package com.varun.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_EDUCATION")
@Data
public class DcEducation {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "EDU_ID")
	Integer eduId;
	
	@Column(name = "CASE_NUM")
	Integer caseNum;
	
	@Column(name = "GRADUTATION_YEAR")
	Date gradYear;
	
	@Column(name = "HIGHEST_QUALIFICATION")
	String highqual;
}
