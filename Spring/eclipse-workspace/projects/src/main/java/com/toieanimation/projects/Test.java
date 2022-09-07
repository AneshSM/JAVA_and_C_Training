package com.toieanimation.projects;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext c1= new  ClassPathXmlApplicationContext("com/toieanimation/projects/op.xml");
				System.out.println(c1.getBean("op"));
				op pirate=(op)c1.getBean("op");
				System.out.println(pirate);
				List<String> members=pirate.getPlayers();
				System.out.println(members.getClass());
		c1.close();
	}

}
