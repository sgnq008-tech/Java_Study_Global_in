package SwitchEX;
/*
 * 문]
 *     주민등록번호를 입력받아 성별을 확인하는 프로그램을 구현하시오.
 *     1, 3: 남성
 *     2, 4: 여성
 */

import java.util.*;

public class SwitchEX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("주민번호 입력");
		char jumin = sc.next().charAt(7);
		// 문자열에서 7번째를 인식하는 것
		
		/*String jumin = sc.next().charAt(7);
		char jumin = ju.charAt(7);
		*/
		
		
		/*
		 * switch (jumin) { case "1": case "3": System.out.println("남성"); break; case
		 * "2": case "4": System.out.println("여성"); break; default:
		 * System.out.println("유효하지 않는 주민번호입니다."); }
		 * 
		 * }
		 */
		switch (jumin) {
		case '1':
		case '3':
			System.out.println("남성");
			break;
		case '2':
		case '4':
			System.out.println("여성");
			break;
		default:
			System.out.println("유효하지 않는 주민번호입니다.");
		}

	}

}
