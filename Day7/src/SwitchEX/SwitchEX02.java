package SwitchEX;
/*
 * 문]
 *  커피 메뉴의 가격을 알려주는 프로그램을 구현하시오.
 *  에스프레소, 카푸치노, 카페라떼는 3500원
 *  
 *  아메리카노는 2000원이다.
 *  그 외의 커피 메뉴가 입력되면 "메뉴에 없습니다"를 출력
  */

import java.util.*;

public class SwitchEX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("무슨 커피를 드릴까요?");
		String order = sc.next();
		int price = 0;

		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;

		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다.");
		}

		if (price != 0) // price가 0이 아니면(!부정형)
			System.out.println(order + "는" + price + "입니다");

	}

}
