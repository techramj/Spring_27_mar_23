package com.seed.service;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LoanService {
	
	public void issueLoan(String customerId) {
		//logging
		System.out.println("Entered: LoanService.issueLoan at "+new Date());
		
		System.out.println("loan issued to customer: "+customerId);
		
		System.out.println("Exit: LoanService.issueLoan at "+LocalDateTime.now());
	}
	
	
	public void payDue(String customerId) {
		System.out.println("Entered: LoanService.payDue at "+LocalDateTime.now());
		//query to find the due
		System.out.println("Begin transaction");
		try {
			System.out.println("Pending due is cleared for customer "+customerId); //insert
			System.out.println("deleting the customer entry from loanAccount");  //delete
			System.out.println("commit");
		}catch(Exception e) {
			System.out.println("Rollback");
		}
		
		System.out.println("Exit: LoanService.payDue at "+LocalDateTime.now());
	}

}
