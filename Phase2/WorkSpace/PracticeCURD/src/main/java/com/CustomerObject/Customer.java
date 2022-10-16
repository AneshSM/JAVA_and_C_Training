package com.CustomerObject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cusId;
	private String cusName;
	@Id
	private String cusUsrName;
	private String cusPassword;
	private Long cusPhNo;
	private String cusEmail;
	
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusUsrName() {
		return cusUsrName;
	}
	public void setCusUsrName(String cusUsrName) {
		this.cusUsrName = cusUsrName;
	}
	public String getCusPassword() {
		return cusPassword;
	}
	public void setCusPassword(String cusPassword) {
		this.cusPassword = cusPassword;
	}	
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}

	public Long getCusPhNo() {
		return cusPhNo;
	}
	public void setCusPhNo(Long cusPhNo) {
		this.cusPhNo = cusPhNo;
	}
	public String getCusEmail() {
		return cusEmail;
	}
	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}
}
