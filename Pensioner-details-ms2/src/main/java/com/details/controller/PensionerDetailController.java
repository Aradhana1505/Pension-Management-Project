package com.details.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.details.entity.PensionerDetail;
import com.details.service.IPensionerDetailService;

@RestController
@RequestMapping("/pensiondb")
public class PensionerDetailController {

	@Autowired
	IPensionerDetailService iPensionerDetailService;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{aadharNumber}")
	public Optional<PensionerDetail> getPensionerDetailsByAadhar(@PathVariable("aadharNumber") String aadharNumber) {
		Optional<PensionerDetail> pensionerDetail = iPensionerDetailService.getPensionerDetailsByAadhar(aadharNumber);
		return pensionerDetail;
	}
}
