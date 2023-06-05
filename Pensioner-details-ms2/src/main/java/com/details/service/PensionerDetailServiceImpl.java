package com.details.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.entity.PensionerDetail;
import com.details.repo.IPensionerDetailRepo;

@Service
public class PensionerDetailServiceImpl implements IPensionerDetailService{

	@Autowired
	IPensionerDetailRepo iPensionerDetailRepo; 
	
	@Override
	public Optional<PensionerDetail> getPensionerDetailsByAadhar(String aadharNumber) {
		return iPensionerDetailRepo.findById(aadharNumber);
	}

}
