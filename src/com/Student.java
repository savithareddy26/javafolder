package com;

public class Student {
	public String studName;
	public int studId;
	public int studAge;
	public float studGpa;
	public String studBranch;
	public void displayStudName(String studName)
	
	{
		System.out.println(studName);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello this is an student portal");
		Student a=new Student();
		a.displayStudName("vamshi");
	}
}
