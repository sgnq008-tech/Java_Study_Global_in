package com.methodex;
// 특정 수를 입력받아 처리하는 메소드

import java.util.*;

public class MethodEx04 {
	
	public static int getInt(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str+" : ");
		int i =sc.nextInt();
		return i;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor = getInt("국어 점수");		
		System.out.println("국어 점수는 "+kor+"점 입니다.");
		
		
		
		
		
	}

}
