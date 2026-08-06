package com.ArrayEX;

public class ArrayEX02 {

	public static void main(String[] args) {
		// 배열선언 및 초기화
		int[] arr = {1,2,3,4,5,6,7,8,9,0}; // 자료형 삽입
		int arr2[] = {1,2,3,4,5,6,7,8,9,0}; // 배열형 삽입

		arr = new int[10]; // 예전 방식
		System.out.println("배열의 개수(크기) : " +arr.length);
		System.out.println("배열의 개수(크기) : " +arr2.length);
		
		System.out.println();
		// 배열에 저장된 값 출력
		for(int i = 0; i < arr.length; i++) // 1차원 배열을 활용
	    //i < arr.length; 는 i < 10 이란 뜻;
        System.out.println("arr["+i+"] :" +arr[i]+" ");
		
		System.out.println();
		
	    for (int i = 0; i < 10; i++)
		System.out.printf("arr2[%d] :%d\t " , i, arr2[i]);
	}

}
