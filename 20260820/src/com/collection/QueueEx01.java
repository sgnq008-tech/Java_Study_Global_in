package com.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	private static final String colors[] = { "검정", "노랑", "초록", "파랑", "연두" };

	public static void main(String[] args) {

		Queue<String> qu = new LinkedList<>();

		for (String str : colors) {
			qu.offer(str); // 큐에 데이터를 저장
		}
		System.out.print("queue : ");

		while (qu.peek() != null) {// peek(): queue가 비어있으면 null값을 반환함
			System.out.print(qu.poll() + " "); // 큐에 데이터를 출력
		}

	}

}
