/*
 * inheritance is a mechanism that allows a new class (the "child" or "derived" class) 
 * to inherit the properties and behaviors of an existing class 
 * (the "parent" or "base" class). 
 */

package com.example;

class Employee {
	private int employeeId;
	private String name;
	private double salary;
	
	public Employee(int employeeId, String name, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void increaseSalary(double amount) {
		this.salary += amount;
	}
	
	public String displayDetails() {
		return "employeeId=" + employeeId 
				+ ", name=" + name 
				+ ", salary=" + salary ;
	}
}


class Manager extends Employee{
	private String department;
	private static double bounus = 10000;

	public Manager(int employeeId, String name, double salary, String department) {
		super(employeeId, name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void organizeMeating() {
		System.out.println("Manager " + getName() + " is organizing meating in "+ department +" department");
	}
	
	// method overriding for get salary
	public double getSalary() {
		return super.getSalary()+bounus;
	}
}

class Developer extends Employee {
	private String level;

	public Developer(int employeeId, String name, double salary, String level) {
		super(employeeId, name, salary);
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		Employee employee = new Employee(1001, "employee_1", 30000);
		System.out.println(employee.displayDetails());
		
		Manager manager = new Manager(1002, "magager_1", 50000, "HR");
		System.out.println(manager.displayDetails());
		
		manager.increaseSalary(10000);
		
		System.out.println(manager.displayDetails());
		
		Developer developer1 = new Developer(1003, "developer_1", 40000, "Senior");
		
		
		System.out.println(developer1.getLevel());
		
		//Polymorphism achieved
		Employee developer2 = new Developer(1004, "developer_1", 40000, "Senior");
		System.out.println(developer2.displayDetails());
	}

}
