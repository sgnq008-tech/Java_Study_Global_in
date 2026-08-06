package com.ArrayEXexam;

import java.util.Scanner;

/* 문]
 *       정수를 입력받고, 아래와 같이 *을 출력하는 프로그램을 작성하시오.
 *        
 *        정수입력 : 5
 *        
 *        *****
 *        ****
 *        ***
 *        **
 *        *
 */
public class ArrayEX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 :");
		int n = sc.nextInt();

		for(int i = n; i >0; i--) { //행
			for(int j = 0; j<i; j++) { //열
					System.out.print("*");
					}
			System.out.println();
			}
}}
