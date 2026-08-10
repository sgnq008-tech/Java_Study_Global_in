package Array;
/*Person이라는 이름의 클래스를 만듭니다. (Main 메서드가 없는 일반 클래스입니다.)

Person 클래스 안에 아래 속성(변수) 2개를 만드세요.

이름: String name;

나이: int age;

Person 클래스 안에 아래 기능(메서드) 1개를 만드세요.

메서드 이름: sayHello

리턴 타입: void

동작 내용: 실행하면 System.out.println("안녕하세요!"); 출력
 */
public class Person {
    // 1. 속성 (변수)
    String name;
    int age;

	// 2. 기능 (메서드)
    public void sayHello() {
    	System.out.println("안녕하세요!");
        // 여기에 "안녕하세요!" 출력하는 코드 작성
    }
}