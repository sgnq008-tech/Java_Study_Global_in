package com.ifexam;

import java.io.IOException;

public class IfEX07 {

	public static void main(String[] args) throws IOException{
		char ch;
		int n;
		System.out.print("알파벳 한문자입력 :");
		n = System.in.read();
		
		if(n >=65 && n <=90) {
			n +=32;
			ch=(char)n;
			System.out.println(ch);
		}else if (n >=97 && n <=122) {
			n-=32;
			ch=(char)n;
		}else {
			System.out.println("입력 오류");
		}
	}}
		/*Scanner sc = new Scanner(System.in); 
		
		System.out.print("알파벳 한문자입력 :");
		ch = sc.next().charAt(0);
		
		if((ch >='a' && ch <='z')||(ch >='A' && ch <='Z')) {
			if(ch=='A' || ch =='B' || ch =='C' || ch =='D' || ch == 'E')
				System.out.println("a,b,c,d,E");
			else if(ch=='a' || ch =='b' || ch =='c' || ch =='d' || ch == 'e')
				System.out.println("A,B,C,D,E");
			else
				   return;
		}else {
			System.out.println("입력 오류");
		}


	}}
	*/
