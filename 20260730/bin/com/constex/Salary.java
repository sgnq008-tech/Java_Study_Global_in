package com.constex;
/*
 *  접근 제한자
 *  	- 멤버들은 객체 자신들만의 속성이자 특징이므로 대외적으로 공개되는 것이 결코 좋은 것이 아니다
 *  	그런 이유로 프로그래머가 객체의 멤버들에게 접근 제한을 걸수가 있는데 자바에서는 이를 접근 제한자라고 함
 *  
 *  
 *  public		:	모든 접근을 허용
 *  protected	:	같은 패키지에 있는 객체와 상속관계의 객체들만 허용함 
 *  default		:	같은 패키지에 있는 객체들만 허용
 *  private		:	현 객체 내에서만 허용함
 * 
 * 
 */
public class Salary {

	private int pay;

	public int getPay() {
		return pay;
	}

	public void setPay(int pay,String pass) {
		if(pass.equals("1234"))
			this.pay = pay;
		
		
	}
	
	
}
