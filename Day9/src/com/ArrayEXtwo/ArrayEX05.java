package com.ArrayEXtwo;

import java.util.Scanner;

public class ArrayEX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		String [][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은 ?",i+1,words[i][0] );
			String str = sc.nextLine();
			
			if(str.equals(words[i][1])) {
				System.out.println("정답 \n");
				
			}else {
				System.out.printf("틀림 정답은 %s입니다. \n",words[i][1]);
			}
			
		}
		

	}

}
