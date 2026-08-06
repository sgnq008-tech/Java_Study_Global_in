package com.ArrayEXexam;

import java.util.Scanner;

/* 문]
 *      알파벳 소문자를 하나 입력받아 아래와 같이 출력하는 프로그램을 구현하시오.
 *      
 *      알파벳 소문자 : e
 *      
 *      abcde
 *      abcd
 *      abc
 *      ab
 *      a
 * 
 */

import java.util.*;
public class ArrayEX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	       System.out.println("알파벳 소문자 :");

	        char c = sc.next().charAt(0); // char버젼
	        
	        for(int i = c; i >='a'; i--) {
	        	for(int j = 'a'; j <= i; j++) {
	        		System.out.print(j);
	        	}
	        	System.out.println();
	        }
	        
	        

	}

}
