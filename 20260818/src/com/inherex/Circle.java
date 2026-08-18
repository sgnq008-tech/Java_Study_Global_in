package com.inherex;

public class Circle extends Shape {
	Point center;
	int r;
	
	public Circle()
	{
		this(new Point(0,0),100);
	}
	public Circle(Point center, int r)
	{
		this.center = center;
		this.r = r;
	}
	void draw()
	{
		System.out.printf("[center=(%d, %d), r = %d, color = %s]",
				center.x,center.y,r,color);
	}
	
	
	

}
