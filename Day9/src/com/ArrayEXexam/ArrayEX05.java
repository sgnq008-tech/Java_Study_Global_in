package com.ArrayEXexam;

import java.util.Scanner;

/*문]
*정수로 된 돈의 금액을 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전
*100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전의 각 몇개인지를
*변환하는 프로그램을 구현하시오.
*
* 
* 결과 
* 금액 입력 : 65376
* 오만원권 1매
* 만원권 1매
*천원권 5매
*백원 3개
*오십원 1개
*십원 2개
*1원 6개
 * 
 */
import java.util.*;
public class ArrayEX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 입력 :");
		int money = sc.nextInt();
		
		int[] unit = {50000, 10000, 1000, 100, 50, 10, 1 };
		
		for(int i = 0; i < unit.length; i++) {
			int result = money / unit[i]; // 동전개수
			
			if(result > 0) {
				System.out.println(unit[i]+ "원 짜리: "+result+ "개");	
			money %= unit[i]; // 남은 돈
		}
		
}

	}}
