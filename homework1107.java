package com.yedam;

import java.util.Scanner;

public class homework1107 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };

		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for (int i = 0; i <= arr1.length - 1; i++) {
			if (arr1[i] == 60) {
				System.out.println("값이 60인 곳의 인덱스는 : " + i);
			}
		}

		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		System.out.print("인덱스가 3이 아닌 곳들은 : ");
		for (int i = 0; i <= arr1.length - 1; i++) {
			if (i != 3) {
				System.out.print(arr1[i] + " ");
			}
		}
		System.out.println();

		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		System.out.println("변경하고 싶은 값의 인덱스 번호를 입력하세요.");
		int selectNum = Integer.parseInt(sc.nextLine());
		for(int i=0; i<=arr1.length-1; i++) {
			if(i == selectNum) {
				arr1[i] = 1000;
			}
		}
		

		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int maxNum = 0;
		int minNum = 0;
		for (int i = 0; i <= arr1.length - 1; i++) {
			if (maxNum < arr1[i]) {
				maxNum = arr1[i];
			}
			if (minNum > arr1[i]) {
				minNum = arr1[i];
			}
		}
		System.out.println("최대값은 : " + maxNum + "\t 최소값은 : " + minNum);

		// 문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int[] arr2 = new int[10];
		System.out.println("양의 정수 10개를 입력하세요.");
		int count = 0;
		int i = 0;
		
		while(count!=10) {
			int num = Integer.parseInt(sc.nextLine());
			if(num>0) {
				arr2[i] = num;
				i++;
				count++;}
					}
		
		System.out.print("배열에 있는 정수 중에서 3의 배수는 : ");
		for (int j = 0; j <= arr2.length - 1; j++) {
			if (arr2[j] % 3 == 0) {
				System.out.print(arr2[j] + " ");
			}
		}
		System.out.println();

		
		
	}
}