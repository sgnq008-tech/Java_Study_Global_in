package com.abstractex;

// 추상 클래스
public abstract class Unit {
	
	// 멤버 변수
	int x, y;
	
	// 추상 메서드
	abstract void move(int x, int y);
	abstract void stop();
	abstract void message();

}
