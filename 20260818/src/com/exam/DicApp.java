package com.exam;

/* Dictionary 클래스를 실행하여 아래와 같은 결과 출력되도록korEng()메소드를
 * 구현하시오.
 * 
 * 결과
 * 한영 단어 검색 프로그램입니다
 * 한글:희망
 * 희망은/는 hope
 * 한글: 아가
 * 아가는 저의 사전에 없습니다.
 * 한글 :아기
 * 아기은/는 baby
 * 한글: 그만
 * 프로그램을 종료 합니다.
 * 
 */
import java.util.*;
public class DicApp {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("한영 단어 검색 프로그램입니다");
	while(true)
	{
		System.out.println("한글:");
		String kor = sc.next();
		if(kor.equals("그만"))
		{
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		
		String eng = Dictionary.kor2eng(kor);
		if(eng == null)
		{
			System.out.println(kor+"는 저의 사전에 없습니다.");
		}else
		{
			System.out.println(kor+"은"+eng);
		}
	}
	}

}
