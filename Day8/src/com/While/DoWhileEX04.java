package com.While;
/*
 * 문]
 *  사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 4의 배수를 출력하는
 *  프로그램을 구현하시오.
 *  
 *  정수입력 : 6
 *  4 8 12 16 20........
 */
import java.util.*;
public class  DoWhileEX04 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n,i = 1;
		System.out.print("정수 입력 :");
		n = s.nextInt();
		
		 do{
			System.out.println(i*4+"\t");
			i++;
		}while(i <=n);
		
		

	}}