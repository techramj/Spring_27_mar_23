package com.seed.service;

public class LoanService {

	public void issueLoan(String customerId) {
		
		System.out.println("loan issued to customer: " + customerId);
	}

	public void payDue(String customerId) {

		System.out.println("Pending due is cleared for customer " + customerId); // insert
		System.out.println("deleting the customer entry from loanAccount"); // delete
	}

	public void foo() {

	}

}
