package com.ex;

import java.util.*;
public class Ifp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		System.out.printf("x=%d 일떄. 참인 것은%n", x);
		
		if (x == 0)
			System.out.println("x==0");
		if (x != 0)
			System.out.println("x!=0");
		if (!(x == 0))
			System.out.println("!(x==0)");
		if (!(x != 0))
			System.out.println("!(x!=0)");
		
		x = 1;
		System.out.printf("x=%d 일떄. 참인 것은%n", x);
		
		if (x == 0)
			System.out.println("x==0");
		if (x != 0)
			System.out.println("x!=0");
		if (!(x == 0))
			System.out.println("!(x==0)");
		if (!(x != 0))
			System.out.println("!(x!=0)");
		
		
		

	}

}
