package com.person.project;

public class persons {
	private int id;
	private String name;
	private long phnum;
	private address a1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhnum() {
		return phnum;
	}
	public void setPhnum(long phnum) {
		this.phnum = phnum;
	}
	public address getA1() {
		return a1;
	}
	public void setA1(address a1) {
		this.a1 = a1;
	}
	@Override
	public String toString() {
		return "persons [id=" + id + ", name=" + name + ", phnum=" + phnum + ", a1=" + a1 + "]";
	}
	
}
