package com.infy.InfyMeMobile_Accounting.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.InfyMeMobile_Accounting.dto.BankAccountDTO;
import com.infy.InfyMeMobile_Accounting.dto.TransactionDTO;
import com.infy.InfyMeMobile_Accounting.entity.BankAccountEntity;
import com.infy.InfyMeMobile_Accounting.repository.AccountRepository;

@Service(value = "bankAccountService")
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private AccountRepository accountRepository;

	@Override
	public String createAccount(BankAccountDTO accountDTO) {
		BankAccountEntity savedAccount = accountRepository.save(BankAccountDTO.prepareEntity(accountDTO));
		return "Account has successfully been created..!"
				+ " your account number is : "+savedAccount.getAccountNumber();
	}

	@Override
	public BankAccountDTO getAccountDetails(Long accountNumber) {
		Optional<BankAccountEntity> accountEntity = accountRepository.findById(accountNumber);
		return BankAccountDTO.prepareDTO(accountEntity.get());
	}

	@Override
	public List<BankAccountDTO> getAllAccounts() {
		

		/*
		 * List<BankAccountEntity> allAccounts = accountRepository.findAll();
		 * List<BankAccountDTO> dtoList = new ArrayList<>(); for(BankAccountEntity
		 * entity:allAccounts) { dtoList.add(BankAccountDTO.prepareDTO(entity)); }
		 * return dtoList;
		 */

		return  
				accountRepository
				.findAll()
				.stream()
				.map(entity -> BankAccountDTO.prepareDTO(entity))
				.collect(Collectors.toList());
	}

	@Override
	public String fundTransfer(TransactionDTO transactionDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BankAccountDTO> listAccounts(Long mobileNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String linkAccount(Long mobileNo, Long accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String linkAccount(Long mobileNo, Long accountNo, Integer OTP) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double checkBalance(Long mobileNo, Long accountNo) {
		return accountRepository
		       .findByAccountNumberAndMobileNumber(accountNo, mobileNo)
		       .getBalance();
	}

	@Override
	public List<TransactionDTO> accountStatement(Long mobileNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
