package com.constex;

/*
 * 	this 와 this()
 * 
 * 
 * 	- this란 특정 객체 내에서 자신이 생성되었을 때의 주소 값 변수
 * 	- 객체의 주소는 생성 전까지는 모르기 때문에 객체 생성 후 자신의 주소로 대치됨
 * 
 * 
 * 	-this()
 * 		현재 객체 생성자를 의미함
 * - 생성자 안에서 오버로딩된 다른 생성자를 호출할경우 this()라는 키워드로 호출함
 * 
 */



public class ThisEx {

	
	private String name;
	private String jumin;
	private String tel;
	
	public ThisEx() {
		this.name="홍길동";
		this.jumin="000000-1234567";
		this.tel="000-0000-0000";
	}

	public ThisEx(String name) {
		this();
		this.name = name;
		
	}

	public ThisEx(String name,String jumin) {
		this(name);
		this.jumin = jumin;
		
		
	}

	public ThisEx(String name,String jumin,String tel) {
		this(name,jumin);
		this.tel = tel;
		
	}
	
}
