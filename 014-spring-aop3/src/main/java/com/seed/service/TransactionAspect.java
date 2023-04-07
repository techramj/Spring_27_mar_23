package com.seed.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TransactionAspect {

	@Around("execution(* LoanService.payDue(..))")
	public void around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Begin Transaction");
		try {
			jp.proceed();
			System.out.println("commit");
		} catch (Exception e) {
			System.out.println("Rollback");
		}
		
	}

}
