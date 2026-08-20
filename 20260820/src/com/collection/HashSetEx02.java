package com.collection;

import java.util.*;

// 사용자 정의 Person 클래스
class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 객체를 출력할 때 "이름:나이" 형태로 보여주기 위한 오버라이딩
	@Override
	public String toString() {
		return name + ":" + age;
	}
}

public class HashSetEx02 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		// 1. 문자열 "abc" 추가 (중복 제거 성공)
		// -> String 클래스는 내부적으로 equals()와 hashCode()가 구현되어 있어 1개만 저장됨
		set.add("abc");
		set.add("abc");
		
		// 2. new Person("David", 10) 추가 (중복 제거 실패!)
		// -> new 키워드로 서로 다른 메모리 주소(참조값)를 가진 별개의 객체 2개가 만들어짐
		// -> Person 클래스에 equals()와 hashCode()를 재정의하지 않아 서로 다른 객체로 인식하고 둘 다 저장됨
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		// 3. 출력 결과: [abc, David:10, David:10] (순서는 달라질 수 있음)
		System.out.println(set);
	}

}