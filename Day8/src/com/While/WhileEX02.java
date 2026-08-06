package com.While;

import java.util.Scanner;

public class WhileEX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       while(true) {
    	   System.out.print("첫번쨰 정수 :");
    	   int a = sc.nextInt();
    	   System.out.print("두번쨰 정수 :");
    	   int b = sc.nextInt();
    	   System.out.println("두 정수의 합 :"+(a+b));
    	   System.out.printf("%d + %d = %d\n\n", a, b,(a+b));


    	   System.out.println("죽여불랑!");
    	   System.out.print("계속 진행하시겠습니까?(y/n)");
    	   char ch = sc.next().charAt(0);
    	   if(ch=='N' || ch == 'n')
    		   break;
    	   
       }
	}

}
