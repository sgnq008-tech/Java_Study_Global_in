package com.ArrayEXexam;
import java.security.PublicKey;
/*문]
 *     정수를 몇개 저장할지 키보드로부터 개수를 입력받아 정수 배열을 생성하고,
 *     1에서 100까지 범의의 정수를 랜덤하게 저장하라.
 *     배열에는 중복된 값을 저장할 수 없도록 하여 출력하라.
 *     
 *     정수 몇개 : 10
 *     48 33 74 94 17 39 55 8 59 81
 *     
 *     1차원 배열로 작성해보자
 */
import java.util.*;
public class ArrayEX07 {

	public static boolean exists(int a[], int from, int r) {
		
		for(int i =0; i < from; i++) {
			if(a[i] == r) { // 배열에 값이 같나? 같으면 빼야한다!!
				return true;
			}
			
		}
		return false;
	
	}
	
	// 메인 함수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개 :");
		int n = sc.nextInt();
		
		if(n <=0 || n > 100) {
			System.out.print("1 ~ 100사이로 입력하세요.");
			return;
		}

		int arr[] = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			  // 1 ~ 100까지의 랜덤 정수
			int r = (int)(Math.random()* 100 + 1);
			
			if(exists(arr, i, r)) {
				i--;
				continue;
			}
			arr[i] =r;
		} // 배열에 랜덤으로 생성한 정수값 저장
		
		for(int i =0; i < arr.length; i++) {
			if(i == 0)
				System.out.print(arr[i]+" ");
			else{
		      if(i % 10 == 0)
		    	  System.out.println();
		      System.out.print(arr[i]+" ");
			}
		}
		

	}}

