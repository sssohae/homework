package com.yedam.h1111q3;

public class Movie extends Culture{

	public String genre;
	
	
	public Movie() {
		
	}
	
	public Movie(String title, int direccnt, int actorcnt, String genre) {
		super(title, direccnt, actorcnt);
		this.genre = genre;
	}
	

	
	@Override
	public void getInformation() {
		System.out.print(title + "에 대한 ");
		setTotalScore(score);
		System.out.print(genre);
		System.out.println("제목 : " + title);
		System.out.println("감독 : " + direccnt);
		System.out.println("배우 : " + actorcnt);
		System.out.println("영화총점 : " + total);
		System.out.println("영화평점 : " + getGrade());
	}

}
