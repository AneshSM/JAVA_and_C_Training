package com.org.spring_core_xml_annotation.ref.object;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.spring_core_xml_annotation.ref.object.College;

public class CollegeTest {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new ClassPathXmlApplicationContext("annotation.xml");
		College c=(College)cac.getBean("myCollege");
		c.getCollege();
	}
}
