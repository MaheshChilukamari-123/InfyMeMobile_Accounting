package com.infy.InfyMeMobile_Accounting.dto;

import java.time.LocalDate;

import com.infy.InfyMeMobile_Accounting.entity.BankAccountEntity;

public class BankAccountDTO {

	private Long accountNumber;
	private String bankName;
	private Double balance;
	private String accountType;
	private String ifscCode;
	private LocalDate openingDate;
	private Long mobileNumber;

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public LocalDate getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public static BankAccountEntity prepareEntity(BankAccountDTO accountDTO) {
		BankAccountEntity entity = new BankAccountEntity();
		entity.setAccountNumber(accountDTO.getAccountNumber());
		entity.setBankName(accountDTO.getBankName());
		entity.setAccountType(accountDTO.getAccountType());
		entity.setIfscCode(accountDTO.getIfscCode());
		entity.setBalance(accountDTO.getBalance());
		entity.setMobileNumber(accountDTO.getMobileNumber());
		entity.setOpeningDate(accountDTO.getOpeningDate());
		return entity;
	}

	public static BankAccountDTO prepareDTO(BankAccountEntity accountEntity) {
		BankAccountDTO accountDTO = new BankAccountDTO();
		accountDTO.setAccountNumber(accountEntity.getAccountNumber());
		accountDTO.setBankName(accountEntity.getBankName());
		accountDTO.setAccountType(accountEntity.getAccountType());
		accountDTO.setIfscCode(accountEntity.getIfscCode());
		accountDTO.setBalance(accountEntity.getBalance());
		accountDTO.setMobileNumber(accountEntity.getMobileNumber());
		accountDTO.setOpeningDate(accountEntity.getOpeningDate());
		return accountDTO;
	}

}
