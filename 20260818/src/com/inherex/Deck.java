package com.inherex;

public class Deck {
	final int CARD_NUM = 52;//카드의 개수
	Card cardArr [] = new Card[CARD_NUM];
	
	public Deck() 
	{//Deck의 카드를 초기화함 
		int i = 0;
		for(int k = Card.KIND_MAX; k>0; k--)
		{
			for(int n = 0; n< Card.NUM_MAX; n++)
			{
				cardArr[i++] =new Card(k,n+1);
			}
		}
	}
	Card pick(int index)
	{	//지정된 인덱스에 있는 카드를 하나 꺼내서 반환함
		return cardArr[index];
	}
	Card pick()
	{	//Deck에서 카드 하나를 선택함 
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	public void shuffle()
	{	//카드의 순서를 섞는다.
		for(int i =0; i<cardArr.length; i++)
		{
			int r = (int)(Math.random()*CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[i];
			cardArr[r] = temp;
		}
	}
	
	
}
