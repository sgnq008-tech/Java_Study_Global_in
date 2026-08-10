package com.inherex;

public class Point extends Shape{

	
	
	int x;
	int y;
	
	public Point() {
		this(0,0);
	}
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	String getXY() {
		return "("+x+","+y+")";//x와 y값을 문자열로 반환 
	}
	
	
	
	
	
}
