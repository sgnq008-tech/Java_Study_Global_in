package com.collection;

import java.util.*;

public class InterratorEx01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		System.out.println(list);
		// Iterator it = list.iterator(); //순방향
		ListIterator it = list.listIterator(); // 역방향

		while (it.equals(it)) {
			System.out.print(it.next()+ " ");  ///////////////코드에 뭔가 문제가 있음 확인하기
		} // 순차적인 방향
		System.out.println();

		while (it.hasPrevious()) { // 역방향
			System.out.print(it.previous() + " ");
		}

	}

}
