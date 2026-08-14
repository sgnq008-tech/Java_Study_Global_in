package com.abstractex;

public class SiegeTank extends Unit {

	@Override
	void move(int x, int y) {
		
		System.out.println("Move it! Move it! SiegeTank! Coordinate X : " + x + ", Y : " + y);
		
	}

	@Override
	void stop() {
		
		System.out.println("Destination ??");
		
	}

	@Override
	void message() {
		
		System.out.println("Message :: Go, SiegeTank !!");
		
	}
	
	void changeMode() {
		
		System.out.println("Yes Sir !!");
		
	}

}
