package com.ifexam;
/*
 * 사용자로부터 임의의 알파벳 한 문자를 입력받아 모음인지를 
 * 판정하는 프로그램을 구현하시오.
 * 단, 대소문자를 모두 적용하고, 알파벳 이외의 문자가 입력되면
 * 입력 오류처리함
 */

import java.util.*;
public class IfEX06 {

	public static void main(String[] args) {
		
		// 문자 하나만 작용
		char ch;
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("알파벳 한문자입력 :");
		ch = sc.next().charAt(0);
		
		// 소문자 a부터 z까지 or 대문자 A부터 Z까지
		if((ch >='a' && ch <='z')||(ch >='A' && ch <='Z')) {
			if(ch=='a' || ch =='e' || ch =='i' || ch =='o' || ch == 'u')
				System.out.println("모음");
			else if(ch=='A' || ch =='E' || ch =='I' || ch =='O' || ch == 'U')
				System.out.println("모음");
			else
				   return;
		}else {
			System.out.println("입력 오류");
		}
		

}}
