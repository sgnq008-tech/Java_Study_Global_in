package com.inherex;

/*
 * Circle is a Shape -> 원은 도형
 * Circle is a Point -> 원은 점
 * 
 * 원은 도형을 가지고 있음
 * 원은 점을 가지고 있음
 * 
 * Circle 과 Shape -> 원과 도형은 상속관계
 * Circle 과 Point -> 포함 관계
 */

public class DrawShape {

	public static void main(String[] args) {
		
		Point[] p = {
				
					 new Point(100, 100),
					 new Point(140, 50),
					 new Point(200, 100)
				
					};
		
		Triangel t = new Triangel(p);
		Circle c = new Circle(new Point(150, 150), 50);
		
		c.draw();
		t.draw();

	}

}
