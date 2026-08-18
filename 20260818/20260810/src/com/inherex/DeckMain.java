package com.inherex;

public class DeckMain {

	public static void main(String[] args) {
		// 카드 한벌을 만든다.(Deck)
		Deck d = new Deck();
		Card c = d.pick(0);// 섞기 전에 제일 위에 카드를 뽑는다.
		System.out.println(c);
		
		d.shuffle();//카드를 섞는다.
		c = d.pick(0);
		System.out.println(c);
	}
	

}
