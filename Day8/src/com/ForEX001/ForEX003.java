package com.ForEX001;

public class ForEX003 {

	public static void main(String[] args) {
		for(int i = 1; i <=5; i--) {
			
		
			for(int j = 1; j<=5; j++) {
				if(i == j)
				System.out.printf("&d,%d\t", i, j);
				else
					System.out.printf("%5c", ' ');
				break;
			}
			System.out.println();
		}
}}
