package com.While;

import java.util.Scanner;

/*문]
 *사용자로부터 숫자를 하나 입력받아서, 그 수만큼 "I LOVE YOU !!"를
 *출력하는 프로그램을 구현하시오.
 *단, while문을 사용
 *
 *결과
 *숫자 입력 : 6
 *
 *I LOVE YOU !!
 *I LOVE YOU !!
 *I LOVE YOU !!
 *I LOVE YOU !!
 *I LOVE YOU !!
 *I LOVE YOU !!
 */
public class DoWhileEX03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i = 1;
		System.out.print("숫자 입력 :");
		n = s.nextInt();
		// 입력설계
		
		
		 do{
			System.out.println("I LOVE YOU !!");
			i++;
		}while(i <= n);
			

	}

}