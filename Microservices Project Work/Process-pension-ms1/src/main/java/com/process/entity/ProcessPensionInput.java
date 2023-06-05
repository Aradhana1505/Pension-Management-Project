package com.process.entity;

import javax.persistence.Entity;

@Entity
public class ProcessPensionInput {
	
	private String aadharNumber;
	private double pensionAmount;
	private double bankServiceCharge;
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public double getPensionAmount() {
		return pensionAmount;
	}
	public void setPensionAmount(double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}
	public double getBankServiceCharge() {
		return bankServiceCharge;
	}
	public void setBankServiceCharge(double bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}
	
	public ProcessPensionInput(String aadharNumber, double pensionAmount, double bankServiceCharge) {
		super();
		this.aadharNumber = aadharNumber;
		this.pensionAmount = pensionAmount;
		this.bankServiceCharge = bankServiceCharge;
	}
	
	public ProcessPensionInput() {
		super();
	}
	
	
}
