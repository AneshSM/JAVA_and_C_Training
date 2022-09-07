package com.InterfaceInjection.projrct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Value("111")
	private int customerid;
	private String cusname;
	@Value("9999999999")
	private long phnum;
	@Autowired
	@Qualifier("Savings")
	private Account acc;
	
	
	
	public int getCustomerid() {
		return customerid;
	}
	
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	public String getCusname() {
		return cusname;
	}
	
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	
	public long getPhnum() {
		return phnum;
	}
	
	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}
	
	public Account getAcc() {
		return acc;
	}
	
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", cusname=" + cusname + ", phnum=" + phnum + ", acc=" + acc
				+ "]";
	}
	
}
