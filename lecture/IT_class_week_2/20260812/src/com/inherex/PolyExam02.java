package com.inherex;

public class PolyExam02 {

	public static void main(String[] args) {
		
		Buyer02 b = new Buyer02();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summary();

	}

}
