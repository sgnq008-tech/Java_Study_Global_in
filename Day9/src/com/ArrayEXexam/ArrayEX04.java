package com.ArrayEXexam;

import java.util.Scanner;

/* 문]
 *      양의 정수 10개를 입력받아 배열에 저장하고,
 *      배열에 저장된 정수 중 3의 배수만 출력하는 프로그램을 작성하시오.
 *      
 *        양의 정수 10개 입력 : 1  5  99  22  345  154  2346  55  32 85
 *        3의 배수는 99 345 2346
 */
import java.util.*;
public class ArrayEX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 점수 10개 입력 :");
		int[] arr = new int[10];

		
		// 1. 양의 정수 10개 입력받기
        for (int i = 0; i < arr.length; i++) { //  arr.length부분을 10으로 대체 가능
            arr[i] = sc.nextInt();
        }

        // 2. 3의 배수 필터링 및 출력
        System.out.print("3의 배수는 ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) 
                System.out.print(arr[i] +"  ");
        }

	}

}
