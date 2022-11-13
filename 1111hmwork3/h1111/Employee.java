package com.yedam.h1111;

public class Employee {

	public String name;
	public int salary;


	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	
	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	
	public void getInformation() {
		System.out.print("이름 : " + name + "\t연봉 : " + salary);
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}

}