package com.objectEX;

import java.util.Scanner;

/* 문]
 *      가로와 세로를 입력받아 사각형의 넓이를 구하는 프로그램을 구현하시오.
 *      클래스는 Rectangle 클래스를 활용하라
 */
import java.util.*;
public class RectangleExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle r = new Rectangle();
		
		System.out.println("가로 : ");
		r.width = sc.nextInt();
		
		System.out.println("세로 : ");
		r.height = sc.nextInt();
		
		System.out.println("사각의 넓이는 " +r.getArea());
		
		
		

	}

}
