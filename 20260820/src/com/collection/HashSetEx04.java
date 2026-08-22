package com.collection;

import java.util.*;

public class HashSetEx04 {

	public static void main(String[] args) {
		// 1. 집합 연산에 사용할 5개의 HashSet 생성
		HashSet setA = new HashSet();   // 집합 A
		HashSet setB = new HashSet();   // 집합 B
		HashSet setHab = new HashSet(); // 합집합 (A ∪ B) 결과를 담을 Set
		HashSet setKyo = new HashSet(); // 교집합 (A ∩ B) 결과를 담을 Set
		HashSet setCha = new HashSet(); // 차집합 (A - B) 결과를 담을 Set

		// 2. 집합 A에 1, 2, 3, 4, 5 추가
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("A :" + setA); // A : [1, 2, 3, 4, 5]

		// 3. 집합 B에 4, 5, 6, 7, 8 추가
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("B : " + setB); // B : [4, 5, 6, 7, 8]

		// 4. [교집합 (A ∩ B) 구하기]
		// -> 집합 B의 요소들을 하나씩 꺼내어, 집합 A에도 들어있는지(contains) 확인 후 추가
		Iterator it = setB.iterator();
		while (it.hasNext()) {
			Object tmp = it.next();
			if (setA.contains(tmp)) { // B에서 꺼낸 요소가 A에도 있으면 교집합에 저장
				setKyo.add(tmp);
			}
		}

		// 5. [차집합 (A - B) 구하기]
		// -> 집합 A의 요소들을 하나씩 꺼내어, 집합 B에는 없는(!contains) 요소만 골라 추가
		it = setA.iterator(); // Iterator 커서를 A의 처음으로 재설정
		while (it.hasNext()) {
			Object tmp = it.next();
			if (!setB.contains(tmp)) { // A의 요소 중 B에 포함되지 않는 것만 차집합에 저장
				setCha.add(tmp);
			}
		}

		// 6. [합집합 (A ∪ B) 구하기]
		// -> A의 모든 요소와 B의 모든 요소를 하나의 Set(setHab)에 전부 집어넣기
		// -> Set의 자체적인 중복 제거 기능 덕분에 겹치는 "4", "5"는 알아서 1개씩만 저장됨
		it = setA.iterator();
		while (it.hasNext()) {
			setHab.add(it.next()); // A의 모든 요소 추가
		}
		it = setB.iterator();
		while (it.hasNext()) {
			setHab.add(it.next()); // B의 모든 요소 추가 (중복은 자동 제거)
		}
		
		// 7. 최종 집합 연산 결과 출력
		System.out.println("A ∩ B : " + setKyo); // 교집합: [4, 5]
		System.out.println("A ∪ B : " + setHab); // 합집합: [1, 2, 3, 4, 5, 6, 7, 8]
		System.out.println("A - B : " + setCha); // 차집합: [1, 2, 3]

	}

}