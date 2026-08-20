package com.collection;

import java.util.*;

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			
			return c2.compareTo(c1) * -1;
			//return c1.compareTo(c2) * -1;
			// -1을 곱해서 기본 정렬방식(오름차순)의 역순으로 변경해야함
		}
		return -1;
	}
}

public class ComperatorEx {

	public static void main(String[] args) {
		String[] strArr = { "cat", "Dog", "lion", "tiger" };
		
		//String의 Comparable구현에 의한 정렬
		// 배열을 정렬할 때 사용하는 메소드: Arrays.sort()
		Arrays.sort(strArr);
		System.out.println("staArr : "+Arrays.toString(strArr));
		
		// 대소문자 구분안하고 정렬
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("staArr : "+Arrays.toString(strArr));
		
		//역순으로 정렬
		Arrays.sort(strArr, new Descending());
		System.out.println("staArr : "+Arrays.toString(strArr));
	}

}
