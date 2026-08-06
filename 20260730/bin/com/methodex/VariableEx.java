package com.methodex;
/*	Varargs(Variable Arguments)
 * 	- 메소드 정의 시 통일된 인자의 자료형에 '...'라고 명시하므로 이를 통해서
 * 	 	메소드를 수행하는 데필요한 인자의 수를 유연하게 구현 할 수 있다.
 * 	(내부적으로 배열화 작업을 작종적으로 처리해 주기 때문에 가능함)
 * 
 * 
 * 
 * 
 */

public class VariableEx {
	
	public void argTest(String ... n) {
		for(int i = 0;i<n.length;i++) {
			System.out.println("n["+i+"] : "+n[i]);
		}
		System.out.println("-------------------------------");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableEx ve = new VariableEx();
		ve.argTest("홍길동","이순신","임꺽정");
		ve.argTest("100","200","300","400","500");
		
		
		
		
	}

}
