package exam;

/*
 * 문]
 * 삼각형의 길이를 나타내는 정수 3개를 입력받고 
 * 이 3개의 수로 삼각형을 만들 수 있는지를 판별하는 프로그램을 작성하시오
 * 
 * 삼각형이 되는 조건
 * 두변의 합이 다른 한변의 합보다 커야됨
 * 
 * 되는 경우
 * 첫번쨰 수: 4
 * 두번쨰 수: 3
 * 세번쨰 수: 5
 * 
 * 안되는 경우
 * 첫번쨰 수: 4
 * 두번쨰 수: 3
 * 세번쨰 수: 9
 */

import java.util.*;
public class IfEX05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.println("첫번쨰 수 :");
		n1 = sc.nextInt();
		System.out.println("두번쨰 수 :");
		n2 = sc.nextInt();
		System.out.println("세번쨰 수 :");
		n3 = sc.nextInt();
		
		if((n1+n2) < n3 ||(n1+n3) < n2 || (n2+n3) < n1) {// 삼각형이 안되는 조건
			// 삼각형이 안되는 조건 : 두변의 합이 다른 한변보다 작은 경우 
			System.out.println("삼각형이 안됩니다.");
		}else {
			System.out.println("삼각형이 됩니다.");
		}
	}}
