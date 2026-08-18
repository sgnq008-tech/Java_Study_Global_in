package com.PolyExam;

public class PolyExam03 {
	public static void main(String[] args)
	{
		BuyerExam b = new BuyerExam();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		
		b.refund(audio);
		b.summary();
	}
}
