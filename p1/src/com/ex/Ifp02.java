//com.ex라는 이름의 패키지 파일이라는 뜻 
package com.ex;

//* - 아스타, all의 의미
import java.util.*;

//예제 2번 클래스 파일
public class Ifp02 {

	//프로그램의 시작 
	public static void main(String[] args) {
		
		//스캐너 변수 scanner 선언
		Scanner scanner = new Scanner(System.in);
		
		//유저리스트 클래스 변수 myUser 선언
		userLIst myUser = new userLIst();
		
		//유저의 이름을 담을 string 타입 userName 선언
		String userName;
		
		System.out.println("사용자를 선택해 주세요.");

		//myUser에 등록된 유저 목록 출력을 위한 반복문 선언
		for(int i=0; i<myUser.name.length; i++) 
		{
			System.out.println(myUser.name[i]);
		}
		
		System.out.println("이름 입력 : ");
		//유저가 선택한 이름을 userName에 저장
		userName = scanner.nextLine();

		System.out.println(userName + "님, 환영합니다.");

		//유저가 입력한 숫자를 받아적기 위한 int 타입 변수 input 선언
		int input;
		System.out.print("숫자를 하나 입력하세요.>");
		
		//유저가 입력한 숫자를 받아오기 위한 String 타입 tmp 변수 선언
		String tmp = scanner.nextLine();
		
		//유저가 입력한 숫자를 숫자로 변환
		//int 타입 = Integer.parseInt(변환할 변수);
		//input 							 사용자가 입력한 숫자
		input = Integer.parseInt(tmp);

		//input에 들어가있는 숫자를 가지고 뭘 할꺼야?
		
		//숫자를 판단하는 로직
		//if 값이 2개
		//				true || false
		//유저가 입력한 숫자가 0일 때
		if (input == 0) 
		{
			System.out.println("입력하신 숫자는 0입니다.");
		}
		else if(input > 5) 
		{
			System.out.println("입력하신 숫자는 5보다 큽니다.");
		}
		//유저가 입력한 숫자가 0이 아닐때
		else if (input != 0)
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		
		System.out.printf("입력하신 숫자는 %d입니다.", input);
		
		scanner.close();

	}

}
