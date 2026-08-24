package com.collection;

import java.util.*;

public class StackEx01 {
	
	// 스택에 넣을 색상 이름들이 담긴 배열 (수정 불가 상수 배열)
	private static final String colors[] = 
		{"검정", "노랑", "초록", "파랑", "연두"};

	// 생성자 메서드: 객체가 생성될 때 자동으로 실행됨
	public StackEx01() {
		// 1. String 데이터를 보관할 Stack 객체 생성
		// - Stack은 "후입선출(LIFO, Last-In First-Out)" 구조입니다.
		// - 상자나 프링글스 통처럼 "가장 나중에 넣은 데이터가 가장 먼저 나오는" 구조입니다.
		Stack<String> st = new Stack<>();
		
		// 2. colors 배열의 요소를 하나씩 스택에 집어넣기 (Pushing)
		// - 넣는 순서: "검정" -> "노랑" -> "초록" -> "파랑" -> "연두" (연두가 가장 위에 쌓임)
		for(String color : colors) {
			st.push(color); // push(): 스택의 맨 위에 데이터를 쌓음
		}
		
		// 3. 스택에 쌓인 데이터를 꺼내서 출력하는 메서드 호출
		popStack(st);
	}
	
	// 스택에서 데이터를 하나씩 꺼내 출력하는 메서드
	public void popStack(Stack<String> s) {
		System.out.print("pop : ");
		
		// s.empty(): 스택이 비어있으면 true, 데이터가 남아있으면 false
		// !s.empty(): "스택이 비어있지 않은 동안" 계속 반복
		while(!s.empty()){ 
			// s.pop(): 맨 위에 있는(가장 나중에 들어간) 데이터를 꺼내고 스택에서 삭제함
			System.out.print(s.pop() + " ");
		}
		
	}

	// 메인 메서드: 프로그램의 시작점
	public static void main(String[] args) {
		// StackEx01 객체를 생성하면서 생성자 실행
		new StackEx01();
	}

}