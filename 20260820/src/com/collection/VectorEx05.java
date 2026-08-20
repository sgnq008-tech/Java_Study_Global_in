package com.collection;

import java.util.*;

public class VectorEx05 {

	public static void main(String[] args) {

		// 1. 문자열 데이터를 순서대로 저장할 Vector 객체 생성
		Vector v = new Vector();
		
		// 2. Vector에 "0"부터 "4"까지 순서대로 추가
		v.add("0");
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		
		// 3. 삭제 전 전체 요소 출력 -> 삭제전 : [0, 1, 2, 3, 4]
		System.out.println("삭제전 : "+v);
		
		// 4. Vector의 요소들을 순회하기 위한 Iterator(반복자) 객체 생성
		Iterator it = v.iterator();
		
		// 5. 첫 번째 요소("0")를 읽어오고, 바로 직전에 읽은 요소("0")를 컬렉션에서 완전히 삭제
		it.next();   // 커서를 "0"으로 이동하며 값을 읽음
		it.remove(); // 방금 읽은 "0"을 Vector에서 제거
		
		// 6. 다음 요소("1")를 읽어오고, 바로 직전에 읽은 요소("1")를 컬렉션에서 완전히 삭제
		it.next();   // 커서를 "1"로 이동하며 값을 읽음
		it.remove(); // 방금 읽은 "1"을 Vector에서 제거
		
		// 7. 앞의 두 요소("0", "1")가 삭제된 후의 Vector 출력 -> 삭제후 : [2, 3, 4]
		System.out.println("삭제후 : "+v);

	}

}