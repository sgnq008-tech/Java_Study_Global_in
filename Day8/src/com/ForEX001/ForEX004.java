package com.ForEX001;

public class ForEX004 {

	public static void main(String[] args) {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
		System.out.println();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);

			for (int i = 65; i <= 90; i++) {
				System.out.print((char) i);
			}
			System.out.println();
			System.out.println();
			for (char a = 'A'; a <= 'Z'; a++) {
			for (char b = a; b <= 'Z'-(a-65); b++) {
				System.out.print("&");
			}
			System.out.println();
		}
			System.out.println();
			System.out.println();
			for (char a = 'A'; a <= 'Z'; a++) {
				for (char b = 0; b < a-65; b++) {
					System.out.println();
				}		
			for (char b = a; b <= 'Z'-(a-65); b++) {
				System.out.print(b);
			}
			System.out.println();
	}
}
	}}
