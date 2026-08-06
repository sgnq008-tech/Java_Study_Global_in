package com.ForEX001;

public class ForEX002 {

	public static void main(String[] args) {
		
		for(int i = 5; i >0; i--) {
		for(int j = 0; j<i; j++) {
				System.out.print("☆");
			}
			for(int j = 6; j>i; j--) {
					System.out.print("!");// 만약 렉이 걸리고, 출력이 안되면 ctrl + c를 눌러 출력 강제 종료를 하자
		}
         System.out.println();
	}
}}
