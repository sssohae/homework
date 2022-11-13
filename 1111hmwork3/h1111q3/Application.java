package com.yedam.h1111q3;

public class Application {
public static void main(String[] args) {
	
	Movie movie = new Movie("추격자",7,5,"영화");
	Performance pfmc = new Performance("지킬앤하이드",9,10,"공연");
	
	movie.getInformation();
	System.out.println("=====================");
	pfmc.getInformation();
	
	//Q1. 조건없이 돌리는거 모르겠어서 점수에 조건걸어서 멈췄는데 이러면 조건도 생기고, 결과창에 점수 이렇게 입력하라는 말도 생김
	//(교수님 결과창보다 +a됨) 이거 괜찮은가?? 원래는 어캐 하는거??
}
}
