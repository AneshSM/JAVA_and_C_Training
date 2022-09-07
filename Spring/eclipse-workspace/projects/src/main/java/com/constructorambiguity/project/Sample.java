package com.constructorambiguity.project;

public class Sample {
	public Sample(double d1,double d2) {
		System.out.println("double-type arguments");
	}
	public Sample(int a,int b) {
		System.out.println("integer arguments");
	}
	public Sample(String x,String y) {
		System.out.println("String arguments");
	}
}
