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
@Table(name = "DC_CHILDRENS")
@Data
public class DcChildrens {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CHILDREN_ID")
	Integer childrenId;
	
	@Column(name = "CASE_NUM")
	Integer caseNum;
	
	@Column(name = "CHILDREN_DOB")
	Date childrenDob;
	
	@Column(name = "CHILDREN_SSN")
	Date childrenSsn;

}
