package com.process.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.process.entity.ProcessPensionInput;
import com.process.service.IProcessPension;

@RestController
@RequestMapping("/pensioner_detail")
public class ProcessPensionController {
	
	@Autowired
	IProcessPension iProcessPension;

	@PostMapping("/aadharNumber")
	public double calculatePension(@PathVariable("aadharNumber") String aadharNumber) {
		
		//ProcessPensionInput processPensionInput = iProcessPension.setPensionAmount();
		//processPensionInput.setPensionAmount(pensionAmount);
		
		return 0;
	}

}

