package com.PolyExam;

public class PolyExam02 {

	public static void main(String[] args) {
		BuyerEx b =new BuyerEx();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		
		b.summary();

	}

}
