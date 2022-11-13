package com.yedam.h1111q2;

public class Human {

	
	public String name;
	public double height;
	public double weight;
	
	
	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void setHeight(double height) {
		if(height<0) {
			System.out.println("잘못된 키 입력입니다.");
		}else {			
			this.height = height;
		}
	}

//Q1. this.height, weight가 그럼 생성자에서랑 메소드에서랑 두번 되는데 괜찮은가??
//Q2. 이거 조건넣고 음수넣으니까 "잘못된 체중 입력입니다" 잠깐 뜨고 그냥 실행됨. return;붙여도 그럼. 어떻게 해결??

	public void setWeight(double weight) {
		if(weight<0) {
			System.out.println("잘못된 체중 입력입니다.");
		}else {			
			this.weight = weight;
		}
	}

	public void getInfomation() {
		System.out.print(name + "님의 신장 " + height + ", 몸무게" + weight);
	}
	
	
}
