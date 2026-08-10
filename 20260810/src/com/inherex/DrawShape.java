package com.inherex;

public class DrawShape {
	
	
	/*
	 * Circle is a Shape => 원은 도형이다.
	 * Circle is a Point => 원은 점이다.
	 * 
	 * 		원은 도형을 가지고 있다.
	 * 		원은 점을 가지고 있다.
	 * 	
	 * 		Circle과 Shape -> 원과 도형은 상속관계
	 * 		Circle과 Point -> 포함관계 
	 * 		
	 * 
	 * 
	 * 
	 */
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] p = {
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)
				
		};
		
		Triangle t = new Triangle(p);
		
		Circle c = new Circle(new Point(150, 150),50);
		
		c.draw();
		t.draw();
		
		
		
	}

}
