package com.inherex;

// 2차원 좌표에서의 점을 의미하는 클래스
public class Point {
	
	int x;
	int y;
	
	public Point() {
		
		this(0, 0);
		
	}
	
	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	String getXY() {
		
		// x 와 y 값을 문자열로 변환
		return "(" + x + ", " + y + ")";
		
	}

}
