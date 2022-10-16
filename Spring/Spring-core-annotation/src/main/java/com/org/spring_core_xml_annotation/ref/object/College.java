package com.org.spring_core_xml_annotation.ref.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "myCollege")
public class College {
	@Autowired
	Branch b;
	public void getCollege() {
		System.out.println("College");
		b.getBranch();
	}
}
