package com.abstractex;

public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		
		System.out.println("마린의 위치 이동 좌표 X : " + x + ", Y : " + y);
		
	}

	@Override
	void stop() {
		
		System.out.println("마린 대기 상태");
		
	}

	@Override
	void message() {
		
		System.out.println("Message :: Standing back...");
		
	}
	
	void stimPack() {
		
		System.out.println("마린 스팀팩 사용");
		
	}

}
