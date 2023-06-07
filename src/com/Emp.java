package com;

public class Emp {
	
		public String empName;
		public int empId;
		public double salary;
		public void displayempName()
		{
			System.out.println(empName);
		}
		public double displaysalary(double salary)
		{
			return salary;
		}
		
		
		public static void main(String[] args) {
			System.out.println("Hello this is an employee portal");
			Emp e=new Emp();
			e.empName="savitha";
			e.displayempName();
			System.out.println(e.displaysalary(25000.00));
		}

		
}

																														