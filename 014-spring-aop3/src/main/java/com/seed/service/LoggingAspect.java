package com.seed.service;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	//@Before(  "execution(* LoanService.*(..))")
	public void before(JoinPoint jp) {
		System.out.println("Entered: " + jp.getSignature().getDeclaringTypeName() + "." + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
	}

	//@After("execution(* LoanService.*(..))")
	public void after(JoinPoint jp) {
		System.out.println("@After: " + jp.getSignature().getDeclaringTypeName() + "." + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
	}
	
	
	@Around(  "execution(* LoanService.*(..))")
	public void log(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Around: " + jp.getSignature().getDeclaringTypeName() + "." + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
		jp.proceed();
		System.out.println("@Around: " + jp.getSignature().getDeclaringTypeName() + "." + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
	}
	
	
	//@AfterThrowing("execution(* LoanService.*(..))")
	public void afterThrowingExection(JoinPoint jp) {
		System.out.println("@AfterThrowing: " + jp.getSignature().getDeclaringTypeName() + "." + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
	}
	
	
	//@AfterReturning("execution(* LoanService.*(..))")
	public void afterReturning(JoinPoint jp) {
		System.out.println("@@AfterReturning: " + jp.getSignature().getDeclaringTypeName() + "." + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
	}



}
