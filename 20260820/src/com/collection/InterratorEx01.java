package com.collection;

import java.util.*;

public class InterratorEx01 {

	public static void main(String[] args) {
		// 1. 데이터를 순서대로 보관할 ArrayList 객체 생성
		ArrayList list = new ArrayList();
		
		// 2. 리스트에 문자열 "1" ~ "5"까지 순서대로 추가
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		// 3. 리스트 전체 내용 출력 -> [1, 2, 3, 4, 5]
		System.out.println(list);

		// 4. 양방향(앞/뒤) 이동이 가능한 ListIterator 객체 생성
		// - 일반 Iterator는 단방향(앞->뒤)만 가능하지만, ListIterator는 역방향도 가능함
		ListIterator it = list.listIterator();

		// 5. [순방향 출력 : 1 -> 2 -> 3 -> 4 -> 5]
		// - it.hasNext(): 다음에 꺼낼 데이터가 있으면 true, 없으면 false
		// - it.next(): 다음 데이터를 꺼내오고 커서를 뒤로 한 칸 이동
		// (기존의 it.equals(it) 에러 코드를 it.hasNext()로 수정)
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println(); // 줄바꿈

		// 6. [역방향 출력 : 5 -> 4 -> 3 -> 2 -> 1]
		// - 위의 순방향 출력이 끝난 후 커서의 위치는 맨 뒤(5 다음)에 가 있음
		// - it.hasPrevious(): 이전에 꺼낼 데이터가 있으면 true, 없으면 false
		// - it.previous(): 이전 데이터를 꺼내오고 커서를 앞으로 한 칸 이동
		while (it.hasPrevious()) {
			System.out.print(it.previous() + " ");
		}

	}

}