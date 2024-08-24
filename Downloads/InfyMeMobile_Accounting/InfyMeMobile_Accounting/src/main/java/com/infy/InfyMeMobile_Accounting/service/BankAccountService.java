package com.infy.InfyMeMobile_Accounting.service;

import java.util.List;

import com.infy.InfyMeMobile_Accounting.dto.BankAccountDTO;
import com.infy.InfyMeMobile_Accounting.dto.TransactionDTO;

public interface BankAccountService {
	
	String createAccount(BankAccountDTO accountDTO);
	List<BankAccountDTO> listAccounts(Long mobileNo);
	String linkAccount(Long mobileNo, Long accountNo);
	String linkAccount(Long mobileNo, Long accountNo, Integer OTP);
	Double checkBalance(Long mobileNo, Long accountNo);
	String fundTransfer(TransactionDTO transactionDTO);
	List<TransactionDTO> accountStatement(Long mobileNo);
	BankAccountDTO getAccountDetails(Long accountNumber);
	List<BankAccountDTO> getAllAccounts();


}
