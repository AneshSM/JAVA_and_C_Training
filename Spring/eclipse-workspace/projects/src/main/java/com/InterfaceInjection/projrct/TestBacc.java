package com.InterfaceInjection.projrct;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext c = new 
				ClassPathXmlApplicationContext("/com/InterfaceInjection/projrct/Interface.xml");
		Customer c2 =(Customer)c.getBean("customer");
		System.out.println(c2);
		Account a1 = c2.getAcc();
		a1.withdraw();
		a1.deposit();
		c.close();
	}

}
