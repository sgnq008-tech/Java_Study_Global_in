package com.methodex;
/*
 * 
 * 	메소드
 * 	1. 메소드(멤버함수) : 객체가 할 수 있 는 동작을 정희라는것 
 * 		메소드 또한 인스턴스 메소들와 static 메소드로 나뉨
 * 
 * 	2. 메소드 구성
 * 		[접근 제한자] [반환형][메소드명](자료형 인자1,자료형 인자2{
 * 			네소드 해야할일(수행문)
 * 			메소드 해야할일(수행문)
 * 		}
 * 	3. [접근 제한자]
 * 		- 자바에서 객체나 멤버들에 대한 접근을 제한하는 방법을 의미함
 * 			public, protected, default, private
 * 
 * 	4. [빈환형]
 * 		- 메소드에서 해야할 일 들을 모두 끝내고 마지막으로 메소드 자신을 불러준 곳으로 반호나하는 값을 자료형을 의미함
 * 		만약, 반환값이 없다면 void라는 예약어로 대처함 -> 생략은 절대 불가함 
 * 
 * 	5. [메소드명]
 * 		- 사용자 정의 이름
 * 
 * 	6. [인자](매개변수)
 * 		-Argument라고도 하며 이것은 메소드를 호출할때 필요에 따라 특정 값을 제공해주기 위해 미리 선언하는 것이며 메소드 호출 시에 반드시
 * 		인자의 자료형과 수가 일치해야함
 * 	
 * 
 * 
 * 
 */

public class MethodEx {
	
	// 더하기 기능, 빼기 기능 , 곱하기 기능 , 나누기 기능
	// 메소드 정의 ,선언 
	public int add(int i,int j) {
//			 반환값 메소드명(인자값)
		return i+j;
	}
	public int sub(int i,int j) {
	return i-j;
}
	public int cob(int i,int j) {
		return i*j;
	}
	public int div(int i,int j) {
		return i/j;
	}
	
	
	public static void main(String[] args) {//메소드 
		// TODO Auto-generated method stub
		
		//객체 생성
		MethodEx m = new MethodEx();
		int i =20,j=20;
		//객체를 활용해서 메소드 호출
		int a = m.add(10,10);
		System.out.println("더한값 : "+a);
		
		int b = m.cob(i, j);
		System.out.println("곱한값 : "+b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
