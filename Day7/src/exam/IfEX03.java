package exam;

/*문]
		정수로 된 돈의 금액을 입력받아 오만원권, 만원권, 천원권, 500원짜리 동전
		100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전의 각 몇개인지를
		변환하는 프로그램을 구현하시오.
		
		* 결과 
		* 금액 입력 : 65376
		* 오만원권 1매
		* 만원권 1매
		*천원권 5매
		*백원 3개
		*오십원 1개
		*십원 2개
		*1원 6개
		*
		*if 문
		*/
		
import java.util.*;
public class IfEX03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		final int omanwon = 50000;
		final int manwon = 10000;
		final int chwon = 1000;
		final int obawon = 500;
		final int bagwon = 100;
		final int  osiwon= 50;
		final int  siwon= 10;
		final int  ilwon= 1;
		
		int result, money;
		
		System.out.print("금액 입력 :");
		money = sc.nextInt();
		
		result = money / omanwon;
		money = money % omanwon;
		if(result > 0) {
			System.out.println("오만원권" +result+ "매");
		}
		
		result = money / manwon;
		money = money % manwon;
		if(result > 0) {
			System.out.println("만원권" +result+ "매");
		}
		
		result = money / chwon;
		money = money % chwon;
		if(result > 0) {
			System.out.println("천원권" +result+ "매");
		}
		
		result = money / obawon;
		money = money % obawon;
		if(result > 0) {
			System.out.println("오백원권" +result+ "매");
		}
		
		result = money / bagwon;
		money = money % bagwon;
		if(result > 0) {
			System.out.println("백원" +result+ "개");
		}
		
		result = money / osiwon;
		money = money % osiwon;
		if(result > 0) {
			System.out.println("오십원" +result+ "개");
		}
		
		result = money / siwon;
		money = money % siwon;
		if(result > 0) {
			System.out.println("십원" +result+ "개");
		}
		
		result = money / ilwon;
		money = money % ilwon;
		if(result > 0) {
			System.out.println("일원" +result+ "개");
		}
		
	}}
		
		
		
	/*	if( n >= omanwon) {
		System.out.println("오만원권");
	}else if( n >= manwon) {
		System.out.println("만원권");
	}else if( n >= manwon) {
		System.out.println("천원권");
	}else if( n >= manwon) {
		System.out.println("오백원");
	}else if( n >= manwon) {
		System.out.println("권");
	}else if( n >= manwon) {
		System.out.println("만원권");*/

