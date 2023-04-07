package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.service.LoanService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		LoanService service = context.getBean("loanService", LoanService.class);
		service.issueLoan("101");
	}
	
	public static void demo2() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		LoanService service = context.getBean("loanService", LoanService.class);
		try {
			//service.getDue("101");
			service.payDue("101");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void demo1(ApplicationContext context) {
		LoanService loanService = context.getBean("loanService", LoanService.class);
		// System.out.println(loanService.getClass().getName());
		loanService.issueLoan("101");
		System.out.println("---------------------------------------");
		// loanService.payDue("101");

		int x = loanService.getDue("101");
	}

}
