package com.inherex;

public class Card {
	//final =값을 바꿀수없게 한다
	static final int KIND_MAX=4; //카드의 무늬
	static final int NUM_MAX=13;// 종류별 카드 수
	
	static final int SPADE = 4;
	static final int DIAMONT = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind; 
	int number;
	
	public Card()
	{
		this(SPADE, 1);
	}
	public Card(int kind, int number)
	{
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() 
	{
		String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
		String numbers = "0123456789XJQK";//숫자 10은 x
		return "kind : "+kinds[this.kind]+", number :"
				+numbers.charAt(this.number);
		
	}
	
	
	
	
	
}
