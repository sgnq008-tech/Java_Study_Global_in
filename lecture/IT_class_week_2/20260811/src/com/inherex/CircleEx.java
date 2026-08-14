package com.inherex;

public class CircleEx extends PointExam {
	
	private int r;
	
	public CircleEx() {}
	
	public CircleEx(int x) {
		
		super(x);
		
		r = 1;
		
	}
	
	public CircleEx(int x, int y) {
		
		super(x, y);
		
		r = 2;
		
	}
	
	public CircleEx(int x, int y, int r) {
		
		super(x, y);
		
		this.r = r;
		
	}
	
	public int getR() {
		
		return r;
		
	}

	public void setR(int r) {
		
		this.r = r;
		
	}
	
	// 출력 메서드
	public void disp() {
		
		super.disp();
		
		System.out.println("r value is " + r);
		
	}

	public static void main(String[] args) {
		
		new CircleEx().disp();
		
		System.out.println("============");
		
		new CircleEx(1).disp();
		
		System.out.println("============");
		
		new CircleEx(2, 3).disp();
		
		System.out.println("============");
		
		new CircleEx(4, 5, 6).disp();

	}

}
