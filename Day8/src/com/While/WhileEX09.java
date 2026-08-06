package com.While;
/* 문]
 *   -50에서 부터 1까지의 수를 출력하는 프로그램을 구현하시오.
 *   단, 한줄에 5개의 수만 출력하고, 수들 사이의 간격을 탭만 띄우시오.
 *   
 *   결과
 *   -50  -49  -48  -47  -46  
 *   -45  -44  -43  -42  -41
 *   -40  -39  -38  -37  -36
 *   -35
 *   
 *   -5
 *    0       1
 */
import java.util.*;
public class WhileEX09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = -50;
		
		while(i <= 1){
		System.out.print(i+"\t");
			i++;
		if(i % 5==0)
		System.out.println();
		}
		
	}

}
