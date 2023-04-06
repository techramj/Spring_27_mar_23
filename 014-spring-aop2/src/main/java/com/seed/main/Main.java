package com.seed.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seed.service.LoanService;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		LoanService loanService = context.getBean("loanServiceProxy", LoanService.class);
		System.out.println(loanService.getClass().getName());
		loanService.issueLoan("101");
		System.out.println("---------------------------------------");
		loanService.payDue("101");
	}

}
