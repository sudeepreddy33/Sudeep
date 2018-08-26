package com.mypackage;

final class Employee {
	public static void main(String[] args) {
		 Employee e=new Employee(100,"sudeep",4000);
		System.out.println(e.empId);
		System.out.println(e.empName);
		System.out.println(e.salary);
		 System.out.println(e.address);
		
	}

	Employee(int empId, String empName, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	private final int empId;
	private final String empName;
	private final int salary;
	Address address;

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getSalary() {
		return salary;
	}

	final void work() {
		// this is one method.

	}

	public class Address {

		public String line1;
		public String line2;
		public String city;
		public String state;
		public int zipcode;

	}

}
