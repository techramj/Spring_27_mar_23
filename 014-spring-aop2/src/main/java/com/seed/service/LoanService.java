package com.seed.service;

public class LoanService {
	
	public void issueLoan(String customerId) {
		System.out.println("loan issued to customer: "+customerId);
	}
	
	
	public void payDue(String customerId) {
		System.out.println("Begin transaction");
		try {
			System.out.println("Pending due is cleared for customer "+customerId); //insert
			System.out.println("deleting the customer entry from loanAccount");  //delete
			System.out.println("commit");
		}catch(Exception e) {
			System.out.println("Rollback");
		}
	}
	
	
	public void foo() {
		
	}

}
