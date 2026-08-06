package com.ifexam;
/*
 * 문]
 * 임의의 정수를 입력받아 입력받은 정수가 짝수인지, 홀수인지, 영인지  
 * 아니면 판독불가인지 판정하는 프로그램을 작성하시오.
 * 
 * 결과
 * 40 ==> 짝수
 *  41 ==> 홀수
 *  0 ==> 영 
 *  나머지는 판독불가
 */
import java.io.*;
import java.util.Scanner;
public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("정수 입력");
		n = sc.nextInt();
		
		if(n ==0) {
			System.out.println(n+"==> 영");
		}else if(n % 2==0) {
			System.out.println(n+"==> 짝수");
		}else if(n % 2 !=0) {
			System.out.println(n+"==> 홀수");
		}else {			
			System.out.println(n+"==> 판독불가");
		}}
		

}
