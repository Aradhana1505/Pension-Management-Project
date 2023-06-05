package com.process.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.process.entity.PensionerDetail;
import com.process.entity.ProcessPensionInput;
import com.process.repo.ProcessPensionRepo;

public class ProcessPensionImpl implements IProcessPension {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	ProcessPensionRepo processPensionRepo;
	
	PensionerDetail pensionerDetail;
	
	@Override
	public double calculatePension(String aadharNumber) {
		
		double pensionAmount = 0;
		
		if(pensionerDetail.getPensionType().equalsIgnoreCase("self")) {
			pensionAmount = (0.8 * pensionerDetail.getSalaryEarned() + pensionerDetail.getAllowances());
		} else if (pensionerDetail.getPensionType().equalsIgnoreCase("family")) {
			pensionAmount = (0.5 * pensionerDetail.getSalaryEarned() + pensionerDetail.getAllowances());
		}
			
		if (pensionerDetail.getBankDetails().getBankType().equalsIgnoreCase("public")) {
			pensionAmount = pensionAmount - 500;

		} else if (pensionerDetail.getBankDetails().getBankType().equalsIgnoreCase("private")) {
			pensionAmount = pensionAmount - 550;
		}
		
		return pensionAmount;
	}

}

//Remaining
//find pensioner by aadharNumber and set pensionAmount.
//write controller for the same