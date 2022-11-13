package com.yedam.h1111q3;

import java.util.Scanner;

public abstract class Culture {
	
	Scanner sc = new Scanner(System.in);
	
	public String title;
	public int direccnt;
	public int actorcnt;
	public int audicnt;
	public int total;
	
	public Culture() {
		
	}
	
	public Culture(String title, int direccnt, int actorcnt) {
		this.title = title;
		this.direccnt = direccnt; 
		this.actorcnt =actorcnt;
	}
	
	
	
	int count;
	int score;
	
	public void setTotalScore(int score) {
		System.out.println("1~10사이의 점수를 입력하세요. 범위를 벗어나면 집계는 종료됩니다.");
		boolean run = true;
		while(run){
			score = Integer.parseInt(sc.nextLine());
			if(score>0 && score<=10) {
			total += score;
			count++;
			}else {
				return;
			}
		}
	}
	
	//Q. 이거 단톡에서 메소드 호출로도 score 받을 수 있다고 하던데 그건 어떻게 하는것..?
	
	
	
	public int getTotal() {
		return total;
	}

	public String getGrade() {
		String grade;
		double avg = total/count;
		if(avg> 9) {
			grade = "☆☆☆☆☆";
		}else if(avg>8) {
			grade = ("☆☆☆☆");
		}else if(avg>6.5) {
			grade = ("☆☆☆");
		}else if(avg>4) {
			grade = ("☆☆");
		}else {
			grade = ("☆");
			}
		return grade;
	}
	
	public abstract void getInformation();
	
}
