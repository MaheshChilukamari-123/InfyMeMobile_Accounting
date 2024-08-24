package com.infy.InfyMeMobile_Accounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.InfyMeMobile_Accounting.entity.BankAccountEntity;

public interface AccountRepository extends JpaRepository<BankAccountEntity, Long>{

	public BankAccountEntity findByAccountNumberAndMobileNumber(Long accountNumber, Long mobileNumber);

}
