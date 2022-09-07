package com.InterfaceInjection.projrct;

public class Current implements Account{

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		 System.out.println("Withdrawal from the current");
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposited from current");
	}
	
}
