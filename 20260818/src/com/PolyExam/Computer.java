package com.PolyExam;

class Computer extends Product {
	
	public Computer()
	{
		super(200);
	}
	@Override
	//문자 열로 변환 
	public String toString() {
			return "Computer";
	}
}
