package com.ArrayEXexam;
/* 문]
 *      정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를
 *      랜덤하게 생성하여 배열에 저장, 그 배열에 저장된 숫자들의 합과 평균을
 *      구하는 프로그램을 작성하시오.
 *      
 *      1에서 10까지 범위 정수를 랜덤하게 생성하는 식
 *      int i = (int)(Math.random() * 10 + 1);
 * 
 */

public class ArrayEX06 {

	public static void main(String[] args) {
             
		
		
		
		
		
		
		int arr[] = new int[10];
		int sum = 0;
		float avg = 0.0f;
		
		for(int i =0; i < arr.length; i++) {
			arr[i] =  (int)(Math.random() * 10 + 1);  //랜덤 생성을 하기위해서 배열을 저장한다.
		}
		
		for(int i =0; i < arr.length; i++) {
			sum += arr[i];
			System.out.printf("%3d\t", arr[i]);
		}
		System.out.println();
		System.out.printf("평균 :%d%n", sum);
		avg = sum / (float)arr.length; //(float)은 생략해도 됨
		System.out.printf("평균 :%.2f", avg);
		
		
		
		
	}

}
