package com.org.spring_core_annottaion.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="myCustomer")
public class Customer {

  int id;
  String name;

  public Customer(@Value(value="10") int id, @Value(value="anesh") String name) {
    super();
    this.id = id;
    this.name = name;
  }
  
  public void print()
  {
    System.out.println(id+" "+name);
  }
}