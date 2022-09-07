package com.InterfaceInjection.projrct;

import org.springframework.stereotype.Component;

@Component
public class Savings implements Account{

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println("Withdrawal from savings");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit from savings");
	}

}
