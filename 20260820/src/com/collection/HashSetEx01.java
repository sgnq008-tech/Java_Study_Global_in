package com.collection;

import java.util.*;

public class HashSetEx01 {

	public static void main(String[] args) {

		// 1. 문자열과 숫자가 섞인 배열 준비 (중복 데이터 포함)
		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		
		// 2. 중복을 허용하지 않는 Set 주머니 생성
		Set set = new HashSet();
		
		// 3. 배열 데이터를 Set에 하나씩 집어넣기
		for(int i = 0; i < objArr.length; i++) {
			// - "1"(글자)과 1(숫자)은 타입이 달라 둘 다 저장됨
			// - 겹치는 "2", "3", "4"는 알아서 1개만 남기고 무시됨
			set.add(objArr[i]); 
		}
		
		// 4. 결과 출력: [1, 1, 2, 3, 4] (중복은 제거되고 타입별로 1개씩만 남음)
		System.out.println(set);

	}

}