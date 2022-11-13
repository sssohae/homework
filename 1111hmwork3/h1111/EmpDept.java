package com.yedam.h1111;

public class EmpDept extends Employee{

	public String department;
	
	
	public EmpDept(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	
	public String getDepartment() {
		return department;
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("\t부서 : " + department);
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	
	
	
	
	
}
