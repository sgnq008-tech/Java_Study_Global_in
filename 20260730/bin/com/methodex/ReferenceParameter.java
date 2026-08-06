package com.methodex;
/*
 * 	참조 호출(Call by reference)
 * 		-메소드 호출 시 전달하려는 인자를 참조(객체) 차료형을 사용할 경우를 의미함
 * 			-기본 자료형이 아닌 일반 객체나 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class ReferenceParameter {
	
	public void increase(int[] n) {
		for(int i = 0;i<n.length;i++) {
			n[i]++;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] r = {100,800,1000};
		ReferenceParameter rp =new ReferenceParameter();
		rp.increase(r);//참조에 의한 메소드 호출 
		for(int i = 0;i<r.length;i++) {
			System.out.println("r["+i+"] : "+r[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
