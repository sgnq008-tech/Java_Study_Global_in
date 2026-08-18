package com.inherex;

public class Point {
	// 2차원 좌표에서의 점을 의미하는 클래스
	int x;
	int y;
	
	public Point()
	{
		this(0,0);
	}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y= y;
	}
	
	String getXY() 
	{
		return"("+x+","+y+")";// x와 y값을 문자열로 반환
	}
	
	
	
	
	
	
	
	
	
}
