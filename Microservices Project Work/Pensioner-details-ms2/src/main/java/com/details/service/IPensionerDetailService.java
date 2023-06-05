package com.details.service;

import java.util.Optional;

import com.details.entity.PensionerDetail;

public interface IPensionerDetailService {

	Optional<PensionerDetail> getPensionerDetailsByAadhar(String aadharNumber);
}
