package com.org.spring_core_annottaion.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportTest {
	ConfigurableApplicationContext cac =new ClassPathXmlApplicationContext("annotation.xml");
	Sport s=(Sport)cac.getBean("mySport");
	
}
