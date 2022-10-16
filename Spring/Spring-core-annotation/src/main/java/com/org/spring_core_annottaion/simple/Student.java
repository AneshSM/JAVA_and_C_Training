package com.org.spring_core_annottaion.simple;

import org.springframework.stereotype.Component;

@Component(value = "myStudent")
public class Student {
	public void getStudent() {
		System.out.println("CSE........");
	}
}
