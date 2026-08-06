package com.While;
/*문]
 * 2의 승수를 입력하여 값을 구하는 프로그램을 구현하시오.
 * 
 * 결과
 * 승수 입력 : 10
 * 2의 10승은 1024입니다.
 */
import java.util.*;
public class WhileEX07 {

	public static void main(String[] args) {
		// 1. 입력처리를 먼저한다.
		Scanner sc = new Scanner(System.in);
		
		// 2. <초기값>변수 선언(n은 승수를 입력받을 값)
		int i =1, n, result = 1;
		
		System.out.print("승수 입력 :");
		n = sc.nextInt();
		
		while(i <= n) { //조건식
			//연산처리
		result *= 2;
			i++; // 증감처리
		}
		System.out.println("2의" +n+"승은 "+result+"입니다.");
		

	}

}
