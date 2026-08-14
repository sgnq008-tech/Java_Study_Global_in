package com.inherex;

public class Triangel extends Shape {
	
	Point[] p = new Point[3];
	
	public Triangel(Point[] p) {
		
		this.p = p;
		
	}
	
	@Override
	void draw() {
		
		System.out.printf("[p1 = %2, p2 = %s, p3 = %s, color = %s]%n",
						  p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
		
	}

}
