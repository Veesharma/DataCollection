package com.varun.service;

import com.varun.entity.DcChildrens;
import com.varun.entity.DcEducation;
import com.varun.entity.DcIncome;

public interface DcCreateCaseService {
	
	public Integer createCase(Integer appId);
	public Integer submitPlanSelection(Integer caseNo, String planNumber);
	public Integer submitIncomeDetails(Integer caseNo, DcIncome income);
	public Integer submitEducationDetails(Integer caseNo, DcEducation educatiodetails);
	public Integer submitChildrenDetails(Integer caseNo, DcChildrens childdetails);
}
