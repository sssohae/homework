package com.yedam.h1111q2;

public class ObesityInfo extends StandardWeightInfo{
	
	
	public double obst;
	
	
	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
	}
	
	
	
	public double getObesity() {
	double obst = (weight - getStandardWeight())/getStandardWeight()*100;	
		return obst;
		
	}
	

	@Override
	public void getInfomation() {
		System.out.print(name + "님의 신장 " + height + ", 몸무게" + weight);
		System.out.printf(", 비만도 %.2f", getObesity());
		System.out.println("입니다.");
	}
	
	
	

	

}
