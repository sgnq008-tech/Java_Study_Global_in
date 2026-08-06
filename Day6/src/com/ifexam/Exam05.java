/*
 * 문]
 * 사용자로부터 임의의 두정와 연산자를 입력받아 
 * 해당 연산자를 처리하는 프로그램을 작성하시오.
 * 단, 입력은 BufferedReader로 하고, 모든 수는 정수 처리하시오.
 * 
 * 출력
 * 첫번째 수: 10
 * 연산자[+ -  * / %]: +
 * 두번쨰 수: 14
 * 
 * 10 + 14 = 24
 */
package com.ifexam;


import java.io.*;
public class Exam05 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		 int num1, num2, result;
		 
		 char op;
	     
	        System.out.print("첫번쨰 수 :");
	        num1 = Integer.parseInt(br.readLine());
	        System.out.print("연산자[+ -  * / %]:");
	        op =(char)System.in.read();
	        System.in.skip(2);
	        System.out.print("두번쨰 수 :");
	        num2 = Integer.parseInt(br.readLine());
	        
	        
	        if(op =='+') {
	        	result = num1 + num2;
	        	 //System.out.println(n1+"" +op+ "" +n2+ " = " +result);
	        	 System.out.printf("%d %c %d = %d", num1, op, num2, result);
	        }else if(op =='-') {
	        	result = num1 - num2;
	        	 System.out.printf("%d %c %d = %d", num1, op, num2, result);
	        	 //System.out.println(n1+"" +op+ "" +n2+ " = " +result);
	        }else if(op =='*') {
	        	result = num1 * num2;
	        	 System.out.printf("%d %c %d = %d", num1, op, num2, result);
	        	 //System.out.println(n1+"" +op+ "" +n2+ " = " +result);
	        }else if(op =='/') {
	        	result = num1 / num2;
	        	 System.out.printf("%d %c %d = %d", num1, op, num2, result);
	        	 //System.out.println(n1+"" +op+ "" +n2+ " = " +result);
	        }else if(op =='%') {
	        	result = num1 % num2;
	        	 System.out.printf("%d %c %d = %d", num1, op, num2, result);
	        	//System.out.println(n1+"" +op+ "" +n2+ " = " +result);
	        }     

}}
