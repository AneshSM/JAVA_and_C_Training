package com.org.spring_core_annottaion.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "mySport")
public class Sport {
	int id;
	String name;
	
	public Sport(@Value(value="01")int id,@Value(value="football") String name) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.name=name;
	}
	public void setName(String name,int id) {
		this.name=name;
		this.id=id;
	}
	  public void print()
	  {
	    System.out.println(id+" "+name);
	  }
}
