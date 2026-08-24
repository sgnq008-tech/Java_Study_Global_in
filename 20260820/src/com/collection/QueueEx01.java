package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	// 큐에 넣을 색상 이름들이 담긴 배열 (수정 불가 상수 배열)
	private static final String colors[] = { "검정", "노랑", "초록", "파랑", "연두" };

	public static void main(String[] args) {

		// 1. Queue(큐) 객체 생성
		// - Queue는 인터페이스이므로, 실제 구현체인 LinkedList를 사용하여 생성합니다.
		// - 큐는 "선입선출(FIFO, First-In First-Out)" 구조로, 먼저 들어간 데이터가 먼저 나옵니다 (줄서기 개념).
		Queue<String> qu = new LinkedList<>();

		// 2. colors 배열의 요소를 하나씩 큐에 집어넣기 (Enqueuing)
		// - 향상된 for문 사용
		for (String str : colors) {
			qu.offer(str); // offer(): 큐의 맨 뒤에 데이터를 추가함 ("검정" -> "노랑" -> "초록" -> "파랑" -> "연두")
		}
		
		System.out.print("queue : ");

		// 3. 큐가 빌 때까지 맨 앞의 데이터를 하나씩 꺼내서 출력하기 (Dequeuing)
		// - qu.peek(): 맨 앞에 있는 데이터를 '삭제하지 않고 확인만' 함. 큐가 비어있으면 null 반환.
		while (qu.peek() != null) {
			// - qu.poll(): 맨 앞에 있는 데이터를 '꺼내서 반환하고 큐에서 삭제'함.
			System.out.print(qu.poll() + " "); 
		}

	}

}