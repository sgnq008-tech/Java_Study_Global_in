package com.ex;

import java.util.Scanner;

public class exCalculator {

	/*
	 * 문]
	 *  사용자로부터 임의의 두 정수와 연산자를 입력받아
	 *  해당 연산자의 처리 결과를 출력하는 프로그램을 구현하시오.
	 *  단, swith ~ case 문으로 구현하시오.
	 *  
	 *  결과
	 *  첫번째 정수 : 2
	 *  연산자 입력[+ - * % ] : +
	 *  두번쨰 정수 : 3
	 *  
	 *  2 + 3 = 5
	 *  
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 변수 두개 필요 //ok
			입력을 받아야 하니까 스캐너 필요 //ok
			
			연산자 4개 +-/% 들어감 //switch 문을 사용하자 ok
			
			숫자를 연산자에 맞춰서 처리하고
			처리한 내용을 출력해 주는 프로그램
		 */
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		//숫자를 담을 변수 선언
		String userChoice = "";
		System.out.println("첫번째 정수 : ");
		firstNumber = Integer.parseInt(sc.nextLine());
		System.out.println("연산자 입력 [+ - * % ] : ");
		userChoice = sc.nextLine();
		System.out.println("두번째 숫자를 입력해주세요.");
		secondNumber = Integer.parseInt(sc.nextLine());
		
		switch(userChoice)
		{
			case "+":
				result = firstNumber + secondNumber;
				System.out.println(firstNumber + " " + userChoice + " " + secondNumber + " = " + result);
			break;
			
			case "-":
				result = firstNumber - secondNumber;
				System.out.println(firstNumber + " " + userChoice + " " + secondNumber + " = " + result);
			break;
			
			case "*":
				result = firstNumber * secondNumber;
				System.out.println(firstNumber + " " + userChoice + " " + secondNumber + " = " + result);
			break;
			
			case "%":
				result = firstNumber % secondNumber;
				System.out.println(firstNumber + " " + userChoice + " " + secondNumber + " = " + result);
			break;
		} 

	}

}
