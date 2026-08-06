package exam;
/*
 * 문]
 *    369 게임을 구현하시오.
 *    1 ~ 99까지 정수를 입력받아 정수에 3, 6, 9 중 하나가 있는 경우는
 *    박수짝으로 출력하고, 두개 있는 경우는 박수짝짝을 출력하는 프로그램을 구현
 *    
 *    13 => 박수짝
 *    36 => 박수짝짝
 *    
 *    결과
 *    1 ~ 99 사이에 정수 입력 : 36(인 경우)
 *    박수짝짝 출력
 */

import java.util.*;
public class IfEX06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0;

		System.out.print("1 ~ 99 사이의 정수 입력 :");

		n = sc.nextInt();

		if (n >= 1 || n <= 99) {
			// 10으로 나눈 몫은 10의 자리, 나머지는 1의 자리
			int sib, il;
			sib = n / 10;
			il = n % 10;

			// 십의 자리 정수 중 3,6,9중 하나가 있는 경우 cnt를 증가 시킴
			if (sib != 0 && sib % 3 == 0)
				cnt++;
			// 일의 자리 정수 중 3,6,9중 하나가 있는 경우 cnt를 증가 시킴
			if (il != 0 && il % 3 == 0)
				cnt++;
			// cnt가 2인 경우 박수짝짝
			if (cnt == 2) {
				System.out.println("박수짝짝");
			// cnt가 1인 경우 박수짝
			} else if (cnt == 1) {
				System.out.println("박수짝");
			} else {
				System.out.println("숫자 범위가 벗어났습니다.");
			}}
	}}
