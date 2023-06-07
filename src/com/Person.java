package com;

public class Person {
	public String perName;
	public String perDob;
	public String perAddress;
	public int perId;
	public String displayperDob()
	{
	return perDob;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello this is an person portal");
		Person p=new Person();
		p.perDob="4/17/2001";
		System.out.println(p.displayperDob());
	
	
	}
	}


