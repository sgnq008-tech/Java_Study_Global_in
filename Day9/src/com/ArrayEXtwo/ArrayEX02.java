package com.ArrayEXtwo;

public class ArrayEX02 {

	public static void main(String[] args) {
		int [][] arr;
		arr = new int [2][3]; // 2행 3열 배열선언
		
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;
		
		System.out.println();
		
		for(int i =0; i < arr.length; i++) {
			for(int j =0; j < arr[i].length; j++) {
				System.out.print("arr["+i+"]["+j+"]:" +arr[i][j]+"\t");
			}
			System.out.println("");
		}
      

	}

}
