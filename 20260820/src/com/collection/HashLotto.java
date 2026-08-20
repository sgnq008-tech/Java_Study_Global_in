package com.collection;

import java.util.*;

public class HashLotto {

	public static void main(String[] args) {
		Set set = new HashSet();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("얼마 : ");
//		int num = sc.nextInt();
//
//		for (int k = 0; k < num; k++);
		for (int i = 0; set.size() < 6; i++) {
			int n = (int) (Math.random() * 45) + 1;
			set.add(n);
		}
		System.out.println();

		// System.out.println(set);
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);

	}

}
