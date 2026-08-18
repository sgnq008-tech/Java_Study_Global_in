package com.inherex2;

public class PCircleEx extends PointExam{
	
	private int r;
	public PCircleEx() {}
	public PCircleEx(int x) 
	{
		super(x);
		r = 1;
	}
	public PCircleEx(int x, int y) 
	{
		super(x,y);
		r = 2;
	}
	public PCircleEx(int x, int y, int r) 
	{
		super(x,y);
		this.r = r;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public void display()
	{
		super.disp();
		System.out.println("r value is "+ r);
	}
	
	
	public static void main(String[] args) {
		new PCircleEx().disp();
		new PCircleEx(1).disp();
		new PCircleEx(2,3).disp();
		new PCircleEx(4,5,6).disp();
	}

}
