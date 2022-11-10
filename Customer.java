package com.yedam;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 상품 수
		// 2) 상품 및 가격입력
		// 3) 분석

		// 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.


		System.out.println("상품 수를 입력하세요. >>");
		int size = Integer.parseInt(sc.nextLine());
		Market[]mk = new Market[size];
		
		for (int i = 0; i < mk.length; i++) {
			Market mk1 = new Market();
			System.out.println("상품 이름을 입력하세요. >>");
			String goods1 = sc.nextLine();
			mk1.setGoods(goods1);
			
			System.out.println("상품 가격을 입력하세요. >> ");
			int price1 = Integer.parseInt(sc.nextLine());
			mk1.setPrice(price1);
			
			mk[i] = mk1;
		}
		
		
		int sum = 0;
		int max = 0;
		String maxNm = null;
		
		for(int i=0; i<mk.length; i++) {
			if(max<mk[i].getPrice()) {
				max = mk[i].getPrice();
				maxNm = mk[i].getGoods();
			}
		}
	
		for(int i=0; i<mk.length; i++) {
			if(mk[i].getPrice() != max) {
			sum+= mk[i].getPrice();
			}
		}
		System.out.println("최고 가격의 상품은 :" +maxNm +  "," + max + "원입니다.");
		System.out.println("최고 가격의 상품을 제외한 상품들의 총합은 : " + sum + "원입니다.");
		
		
		//Q1. 이거 for문 2개 안 돌리고 그냥 1개 안에서 하려고 하면 총합이 안 구해지던데 왜 그런지
		//Q2. 이거 mk[]뒤에 .연산자 안 쓰면 그냥 주소값 나오고 쓰면 객체값 나오는건가??
		//Q3. Market에서 선언해야 하는 요소들 int price 같은 거랑 여기 Customer에서 새로 만드는 int size, sum, max 이런거 구분이 잘 안됨. 구분법
		//Q4. Q3+ 연산도 어디서는 해야하는지 구분 안됨..  최대 최소 이런거는 밖에서 하는거도 사칙연산만 Market에서? for문 돌리는 복잡한건 밖에서 ?
		//Q5. 위의 for문에서 상품수 3번하면 mk[i]에 각각 상품이름, 가격. 2개가 들어가는데 그럼 mk[2][3] 해서 이차원 배열인건가??
		//Q6. 문제 받았을때 클래스 몇개로 나눠야 하는지 잘 모르겠음.. 
		//Q7. 내가 만든거 그냥 클래스 안 배웠을때랑 똑같고 price goods만 따로 떼고 getter setter한건데 지금 상태에서 어떻게 고쳐야할지(클래스 활용 못하고있음)
		 

		}
}
