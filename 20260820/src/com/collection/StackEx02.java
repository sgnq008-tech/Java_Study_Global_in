<<<<<<< HEAD
package com.collection;
import java.util.*;
public class StackEx02 {
	
	public static Stack back = new Stack(); // 뒤로
	public static Stack forward = new Stack(); // 앞으로

	public static void main(String[] args) {
		goURL("1. 네이버");
		goURL("2. 구글");
		goURL("3. 다음");
		goURL("4. 야후");
		
		display();
		
		goBack();
		System.out.println(" -- 뒤로 버튼을 누른 상태 -- ");
		display();

		goBack();
		System.out.println(" -- 뒤로 버튼을 누른 상태 -- ");
		display();

		goForward();
		System.out.println(" -- 앞으로 버튼을 누른 상태 -- ");
		display();
		
		goURL("globalin.co.kr");
		System.out.println(" -- 새로운 주소로 이동 후 --");
		display();


	}
	
	public static void display() {
		System.out.println("back : " +back);
		System.out.println("forward : forward");
		
		System.out.println("현재 화면은 "+back.peek()+"입니다.");
		System.out.println();
		
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
		
	}

}
=======
package com.collection;
import java.util.*;

public class StackEx02 {
	
	// 1. 지나온 페이지들을 차곡차곡 쌓아둘 '뒤로 가기' 스택 (맨 위가 현재 머무는 페이지)
	public static Stack back = new Stack(); 
	
	// 2. 뒤로 가기를 눌렀을 때 되돌아갈 수 있도록 보관하는 '앞으로 가기' 스택
	public static Stack forward = new Stack(); 

	public static void main(String[] args) {
		// 웹 사이트를 순서대로 방문: 네이버 -> 구글 -> 다음 -> 야후 (현재 위치: 야후)
		goURL("1. 네이버");
		goURL("2. 구글");
		goURL("3. 다음");
		goURL("4. 야후");
		
		display(); // 현재 상태 출력 (현재: 야후)
		
		// 1번째 뒤로 가기 실행 (야후 -> 앞으로 스택으로 이동 / 현재: 다음)
		goBack();
		System.out.println(" -- 뒤로 버튼을 누른 상태 -- ");
		display();

		// 2번째 뒤로 가기 실행 (다음 -> 앞으로 스택으로 이동 / 현재: 구글)
		goBack();
		System.out.println(" -- 뒤로 버튼을 누른 상태 -- ");
		display();

		// 1번째 앞으로 가기 실행 (앞으로 스택에서 '다음'을 꺼내 back에 복귀 / 현재: 다음)
		goForward();
		System.out.println(" -- 앞으로 버튼을 누른 상태 -- ");
		display();
		
		// 새 사이트 방문: 새로운 곳으로 이동하면 기존의 '앞으로 가기' 기록은 모두 삭제됨
		goURL("globalin.co.kr");
		System.out.println(" -- 새로운 주소로 이동 후 --");
		display();
	}
	
	// 현재 두 스택의 상태와 '현재 보고 있는 페이지'를 출력하는 메서드
	public static void display() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward); // (오타 수정: "forward" 문자열 대신 변수 forward 출력)
		
		// back.peek(): back 스택의 맨 꼭대기 요소를 확인(삭제 X)하여 현재 페이지 확인
		System.out.println("현재 화면은 " + back.peek() + "입니다.");
		System.out.println();
	}
	
	// [새 페이지 이동]
	public static void goURL(String url) {
		back.push(url); // 방문한 URL을 back 스택에 쌓음
		
		// 새로운 페이지로 이동하면 기존의 '앞으로 가기' 기록은 무효가 되므로 비움
		if(!forward.empty())
			forward.clear();
	}
	
	// [앞으로 가기 버튼]
	public static void goForward() {
		// forward 스택에 페이지가 남아있다면
		if(!forward.empty())
			// forward에서 하나 꺼내서(pop) 다시 back 스택으로 올림(push)
			back.push(forward.pop());
	}
	
	// [뒤로 가기 버튼]
	public static void goBack() {
		// back 스택에 페이지가 남아있다면
		if(!back.empty())
			// 현재 페이지를 back에서 꺼내서(pop) forward 스택으로 보관(push)
			forward.push(back.pop());
	}

}
>>>>>>> 2fccac690dfcf427d52b9e91be42eb2ada05ab5b
