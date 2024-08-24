package com.infy.InfyMeMobile_Accounting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.InfyMeMobile_Accounting.dto.BankAccountDTO;
import com.infy.InfyMeMobile_Accounting.service.BankAccountService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value="api")
@CrossOrigin("http://localhost:3002")
public class AccountController {
	
	@Autowired
	private BankAccountService bankAccountService;
	
	@PostMapping(value="/accounts/create")
	public ResponseEntity<String> createAccount (@Valid @RequestBody BankAccountDTO accountDTO){
		String response = bankAccountService.createAccount(accountDTO);
		return new ResponseEntity<String>(response, HttpStatus.CREATED) ;
	}
	
	@GetMapping(value="/accounts/get/{accountNumber}")
	public ResponseEntity<BankAccountDTO> getAccountDetails (@PathVariable Long accountNumber){
		BankAccountDTO response = bankAccountService.getAccountDetails(accountNumber);
		return new ResponseEntity<>(response, HttpStatus.FOUND) ;
	}
	
	@GetMapping(value="/accounts/all")
	public ResponseEntity<List<BankAccountDTO>> getAllAccounts (){
		List<BankAccountDTO> response = bankAccountService.getAllAccounts();
		return new ResponseEntity<>(response, HttpStatus.FOUND) ;
	}
	
	@GetMapping(value = "/accounts/balance/{mobileNumber}/{accountNumber}")
	public ResponseEntity<Double> checkBalance (Long mobileNumber, Long accountNumber){
		Double response = bankAccountService.checkBalance(mobileNumber, accountNumber);
		return new ResponseEntity<>(response, HttpStatus.OK) ;
	}
	
}
