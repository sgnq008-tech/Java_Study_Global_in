package com.inherex;

public class Deck {
	
	// 카드의 개수
	final int CARD_NUM = 52;
	
	Card[] cardArr = new Card[CARD_NUM];
	
	public Deck() {
		
		// Deck 의 카드를 초기화
		int i = 0;
		
		for(int k = Card.KIND_MAX; k > 0; k--) {
			
			for(int n = 0; n < Card.NUM_MAX; n++) {
				
				cardArr[i++] = new Card(k, (n + 1));
				
			}
			
		}
		
	}
	
	// 
	Card pick(int index) {
		
		return cardArr[index];
		
	}
	
	// 카드를 
	Card pick() {
		
		int index = (int)(Math.random() * CARD_NUM);
		
		return pick(index);
		
	}
	
	// 카드의 순서를 섞음
	public void shuffle() {
		
		for(int i = 0; i < cardArr.length; i++) {
			
			int r = (int)(Math.random() * CARD_NUM);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
			
		}
		
	}

}
