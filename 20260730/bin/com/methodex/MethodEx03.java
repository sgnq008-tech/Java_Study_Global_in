package com.methodex;



import java.util.*;
public class MethodEx03 {

	public static String getString(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str+" : ");
		String ss = sc.next();
		return ss;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = getString("이름");
		System.out.println(name+"님 안녕하세요.");
		
		
	}

}
