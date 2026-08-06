package com.constex;
/*	생성자
 * 	- 메모리 내에 객체가 생성될때 호출되어 객체의 구조를 인식하게 하고 
 *   생성되는 멤버변수들을 초기화 하는데 목적을 둠
 * 
 * - 생성자명은 클래스명과 같아야하고 , return type을 정의하지 말아야한다.
 *	- 프로그래머가 어떠한 생성자도 정의하지 않았을 경우 컴파일러가 기본생성자를 자동으로 정의해줌
 *		-기본 생성자 : 인자가 없는 생성자
 *		MyCalss()
 * 
 * 	- 생성자의 접근제한의 의미
 * 		1. 생선자의 접근제한을 둘 경우 해당 객체를 생성할 수 있는 접근권한을 가짐
 * 		2. 클래스의 접근제한 public으로 정의되어도 생성자를 private로 정의하면
 * 			클래스 내부에서만 접근 가능.
 * 		3. 만약 protected로 정의되는 클래스는 상속관계의 객체들만 생성할 수 있다.
 * 		
 * 	- 생성자의 구성
 * 		[접근제한자][생성자명](자료형1 인자1, 자료형2 인자2, ... . .. .){
 * 		수행문;
 * 		수행문;
 * 		}
 * 
 * 	- 생성자의 특징
 * 		1. 클래스명과 같다.
 * 		2. 반환형 void를 명시 할 수 없다.
 * 		3. 클래스 내부에 생성자가 없을 때는 컴파일러가 기본생성자를 만든다.
 * 		4. 하나의 클래스에는 인자의 수가 다르거나 , 인자의 자료형이 다른 생성자를 여러개 가질 수 있다.(생성자 오버로딩)
 * 		5. 생성자의 첫번째 라인에서 this(인자) 생성자를 사용해서 다른 생성자 하나를 호출 가능.
 * 
 * 
 * 
 * 
 * 
 * 
 */




public class Myclass {
	
	
	private String name;
	private int age;
	
	public Myclass() {//인자가 없는 생성자를 기본생성자라고 함
		this.name="홍길동";
		//this는 Myclass
		this.age=20;
	}

	public Myclass(String n) {
		this.name = n;

	}

	public Myclass(int a, String n) {
		age = a;
		name = n;

	}

	public Myclass(String n, int a) {
		age = a;
		name = n;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	

	
	
	
	
	
	
	
	

}
