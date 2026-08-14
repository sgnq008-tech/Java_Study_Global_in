package com.inherex;

public class DeckMain {

	public static void main(String[] args) {
		
		// 카드 한 벌을 만듬(Deck)
		Deck d = new Deck();
		
		// 섞기 전에 제일 위에 카드를 뽑음
		Card c = d.pick(0);
		
		System.out.println(c);
		
		// 카드를 섞음
		d.shuffle();
		
		c = d.pick(0);
		
		System.out.println(c);

	}

}
