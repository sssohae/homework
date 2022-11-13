package com.yedam.h1111q2;

public class Application {
	public static void main(String[] args) {

		
		StandardWeightInfo std = new StandardWeightInfo("홍길동", 168, 45);
		ObesityInfo obst = new ObesityInfo("박둘이", 168, 90);
		
		
		std.getInfomation();
		obst.getInfomation();
		
		

		
	}
}
