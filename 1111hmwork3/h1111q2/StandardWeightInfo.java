package com.yedam.h1111q2;

public class StandardWeightInfo extends Human {

	
	public double std;
	
	
	public StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
	}

	
	
	
	public double getStandardWeight() {
		double std = (height - 100)*0.9;
		return std;
	}
	
	@Override
	public void getInfomation() {
		super.getInfomation();
		System.out.println(", 표준체중 " + getStandardWeight() + "입니다.");
	}

}
