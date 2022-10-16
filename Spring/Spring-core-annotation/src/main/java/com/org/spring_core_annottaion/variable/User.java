package com.org.spring_core_annottaion.variable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myUser")
public class User {
	
	@Value(value = "100")
	int id;
	@Value(value = "abcd")
	String name;
	
	public void getUser() {
		
		System.out.println(id);
		System.out.println(name);
		
	}
	
}
