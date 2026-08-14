package com.inherex;

public class ColorPoint extends PointEx {
	
	private String color;
	
	public void setColor(String color) {
		
		this.color = color;
		
	}
	
	public void showColorPoint() {
		
		System.out.print(color);
		
		// PointEx 클래스의 showPoint() 메서드 호출
		showPoint();
		
	}
	

}
