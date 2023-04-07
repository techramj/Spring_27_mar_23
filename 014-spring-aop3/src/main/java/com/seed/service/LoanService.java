package com.seed.service;

public class LoanService {

	public void issueLoan(String customerId) {
		System.out.println("loan issued to customer: " + customerId);
	}

	public void payDue(String customerId) {
		System.out.println("Pending due is cleared for customer " + customerId); // insert
		System.out.println("deleting the customer entry from loanAccount"); // delete
	}

	public int getDue(String customerId) {
		int due = 1000;

		if (1 == 1) {
			throw new RuntimeException();
		}

		System.out.println("returning the due........");
		return due;
	}

}
