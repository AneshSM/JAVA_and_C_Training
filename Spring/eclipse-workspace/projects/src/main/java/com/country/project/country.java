package com.country.project;

import java.util.Map;

public class country {
	private String countryname;
	private Map<String,String> stateandlanguage;
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public Map<String, String> getStateandlanguage() {
		return stateandlanguage;
	}
	public void setStateandlanguage(Map<String, String> stateandlanguage) {
		this.stateandlanguage = stateandlanguage;
	}
	@Override
	public String toString() {
		return "country [countryname=" + countryname + ", Stateandlanguage=" + stateandlanguage + "]";
	}
	
}
