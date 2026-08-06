package com.constex;
/*
 * 메소드 오버로딩
 * 	1.	하나의 클래스에서 같은 이름을 가진 메소드가 여러개 정의되는것을 말한다 . 
 * 	2.	같은 이름의 메소드에 인자가 다름
 * 	3.	인자가 다르다는 것은 개수가 다르거나, 자료형이 다르거나, 인자의 순서가 다르것을 의미함.
 * 	4.	같은 목적으로 비슷한 동작을 수행하는 메소드들을 모아 이름을 같게
 * 		만들어 일관성을 유지함
 * 		
 * 		접근제한자		반환형		메소드명		(자료형인자,자료형인자,...)
 * 			접근제한자,반환형은 오버로딩과 상관없음.
 * 			메소드명 : 반드시 동일해야함
 * 			매개변수,자료형,순서는 달라야 함 .
 * 
 * 
 */

public class OverloadingEx01 {
	
	public void getLength(int n) {
		String s = String.valueOf(n);
		
	}
	
	void getLength(float n) {
		String s = String.valueOf(n);
	}
	
	
	private int getLength(String str) {
		System.out.println("입력한 값의 길이 : "+str.length());
		return 0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingEx01 o = new OverloadingEx01();
		o.getLength(1000);;
		o.getLength(3.14f);
		o.getLength("10000");
		
		
		
		
		
		
	}

}
