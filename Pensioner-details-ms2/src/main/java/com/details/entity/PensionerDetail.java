package com.details.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PensionerDetail {

	@Id
	private String aadharNumber;
	private String name;
	private String dateOfBirth;
	private String panNumber;
	private Long salaryEarned;
	private Long allowances;
	private String pensionType;
	
	@Embedded
	private BankDetails bankDetails;
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public Long getSalaryEarned() {
		return salaryEarned;
	}
	public void setSalaryEarned(Long salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
	public Long getAllowances() {
		return allowances;
	}
	public void setAllowances(Long allowances) {
		this.allowances = allowances;
	}
	public String getPensionType() {
		return pensionType;
	}
	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(BankDetails bankDetails) {
		this.bankDetails = bankDetails;
	}
	
	public PensionerDetail(String aadharNumber, String name, String dateOfBirth, String panNumber, Long salaryEarned,
			Long allowances, String pensionType, BankDetails bankDetails) {
		super();
		this.aadharNumber = aadharNumber;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.panNumber = panNumber;
		this.salaryEarned = salaryEarned;
		this.allowances = allowances;
		this.pensionType = pensionType;
		this.bankDetails = bankDetails;
	}
	
	public PensionerDetail() {
		super();
	} 

}
