package com.collection;

import java.util.*;

// Person2 클래스: equals()와 hashCode()를 직접 재정의한 클래스
class Person2 {

	String name;
	int age;

	// 생성자: 이름과 나이를 받아서 객체의 상태를 초기화
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// [2단계 검사] equals() 오버라이딩: 실제 내용물(이름, 나이)이 같은지 비교
	@Override
	public boolean equals(Object obj) {
		// 들어온 객체가 Person2 타입인지 확인
		if (obj instanceof Person2) {
			Person2 tmp = (Person2) obj;
			// 이름과 나이가 둘 다 일치하면 '같은 데이터'로 판정 (true 반환)
			return name.equals(tmp.name) && age == tmp.age;
		}
		return false; // Person2 객체가 아니면 다른 객체로 판정
	}

	// [1단계 검사] hashCode() 오버라이딩: 같은 내용물이면 같은 해시코드(사물함 번호)를 반환하도록 계산
	@Override
	public int hashCode() {
		// "David" + 10 -> "David10" 문자열의 해시코드를 반환하여, 내용이 같으면 같은 정수 ID가 나옴
		return (name + age).hashCode();
	}

	// 객체를 출력할 때 [이름 : 나이] 형식으로 문자열을 보여주기 위한 오버라이딩
	@Override
	public String toString() {
		return name + " : " + age;
	}
}

public class HashSetEx03 {

	public static void main(String[] args) {
		// 중복 저장을 허용하지 않는 HashSet 객체 생성
		HashSet set = new HashSet();

		// 1. String 객체 저장 시도
		// -> String 클래스는 자바 자체에 equals()와 hashCode()가 이미 구현되어 있어 "abc" 1개만 저장됨 (중복 제거)
		set.add(new String("abc"));
		set.add(new String("abc"));

		// 2. Person2 객체 저장 시도
		// -> 1번째 David:10 저장 완료
		set.add(new Person2("David", 10));
		
		// -> 2번째 David:10 저장 시도:
		//    1) hashCode()가 이전 David:10과 동일함 (1단계 통과)
		//    2) equals()로 비교해 보니 이름과 나이가 똑같음 (2단계 일치)
		//    3) 완전히 같은 데이터로 판정되어 저장이 무시됨! (중복 제거 성공)
		set.add(new Person2("David", 10));

		// 3. 최종 출력 결과: [abc, David : 10]
		// -> String과 Person2 모두 중복이 제거되어 1개씩만 정상 출력됨
		System.out.println(set);
	}
}