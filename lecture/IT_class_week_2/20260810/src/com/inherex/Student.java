package com.inherex;

public class Student extends Person {
	
	public void set() {
		
		age = 30;
		
		name = "홍길동";
		
		height = 175;
		
		// weight = 99;
		
		setWeight(99);
		
	}
	
	public void show() {
		
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "세이며, 키는 "
						   + height + "cm, 체중은 " + getWeight() + "kg 입니다.");
		
	}

}
