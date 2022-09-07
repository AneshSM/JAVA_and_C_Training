package com.person.project;

public class address {
	private int pin;
	private String place;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public String toString() {
		return "address [pin=" + pin + ", place=" + place + "]";
	}
	
}
