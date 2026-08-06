package com.ArrayEX;

public class ArrayEX03 {

	public static void main(String[] args) {
		/* 알파벳 구성
		 *   char[] arr1;
		 *   arr1= new char[26];
		 *    
		 *  방법1
		 *   arr1[0] = 'A';
		 *   ......
		 *   arr1[25] = 'Z';
		 *   
		 *   방법2
		 *   char[] arr2 = {'A'....'Z'} //두번쨰 방법 
		 *   
		 *   방법3
		 *   char[] arr3 = new char[26];
		 *    for(int i = 0; b=65 i < arr3.length; i++, b++)
		 *              arr3[i] = (char)b; 

		 */
		// 방법1
		char[] arr1;
		arr1= new char[26];
		arr1[0] = 'A';  arr1[1] = 'B'; arr1[2] = 'C';  arr1[3] = 'D';  arr1[4] = 'E';
		arr1[5] = 'F';  arr1[6] = 'G';arr1[7] = 'H';   arr1[8] = 'I';   arr1[9] = 'J';
		arr1[10] = 'K'; arr1[11] = 'L';arr1[12] = 'M'; arr1[13] = 'N'; arr1[14] = 'O';
		arr1[15] = 'P';  arr1[16] = 'Q'; arr1[17] = 'R'; arr1[18] = 'S';  arr1[19] = 'T';  
		arr1[20] = 'U'; arr1[21] = 'V';arr1[22] ='W';arr1[23] ='X';arr1[24] = 'Y';arr1[25] = 'Z';
		
		
		// 방법2
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
		    System.out.println();
		
		char[] arr2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'} ;
		for(int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		
		// 방법3
		char[] arr3 = new char[26];
		    for(int i = 0, b=65; i < arr3.length; i++, b++) { // 아스키 코드를 사용
		        arr3[i] = (char)b; 
		    System.out.print(arr3[i]+" ");
		 } // 배열에 알파벳 저장
		    
		    System.out.println();
		    
		    // 방법2로 다시 풀이
		  for(int i =0; i < arr2.length; i++) {
			  System.out.print(arr2[i]+" ");
		  }
    
    
	}

}
