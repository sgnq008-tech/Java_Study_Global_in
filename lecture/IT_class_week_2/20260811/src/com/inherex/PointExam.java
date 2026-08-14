package com.inherex;

public class PointExam {
	
	private int x;
	private int y;
	
	// 기본 생성자
	public PointExam() {}
	
	// 매개변수가 하나인 생성자
	public PointExam(int x) {
		
		this.x = x;
		
	}
	
	// 매개변수가 두 개인 생성자
	// 생성자 오버 로딩
	public PointExam(int x, int y) {
		
		// 현재 객체의 생성자 중 매개변수가 하나인 생성자를 의미
		this(x);
		
		this.y = y;
		
	}

	public int getX() {
		
		return x;
		
	}

	public void setX(int x) {
		
		this.x = x;
		
	}

	public int getY() {
		
		return y;
		
	}

	public void setY(int y) {
		
		this.y = y;
		
	}
	
	// 출력 메서드
	public void disp() {
		
		System.out.println("x value is " + x);
		System.out.println("y value is " + y);
		
	}

}
