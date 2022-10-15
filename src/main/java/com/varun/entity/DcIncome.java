package com.varun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_INCOME")
@Data
public class DcIncome {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "INCOME_ID")
	Integer incomeId;
	
	@Column(name = "CASE_NUM")
	Integer caseNum;
	
	@Column(name = "EMP_INCOME")
	Integer empIncome;
	
	@Column(name = "PROPERTY_INCOME")
	Integer propIncome;

}
