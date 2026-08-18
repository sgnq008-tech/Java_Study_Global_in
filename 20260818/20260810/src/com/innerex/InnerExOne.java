package com.innerex;

public class InnerExOne {
	/*1. 이너클래스, 내부클래스, 중첩클래스
	 * 1. 이너 클래스 특징
	 * 		-특정 클래스 내에 또 다른 클래스가 정의되는 것을 의미한다.
	 * 		이런 이너 클래스가 필요한 이유는 지금까지 작업해 왔던 클래스들과는 다르게
	 * 		독립적이지는 않지만 하나의 멤버처럼 사용할 수있는 특징이 있다.
	 * 
	 *  2. 이너클래스를 정의시 주의사항
	 *  	-이너클래스는 외부 클래스의 모든 멤버들을 마치 자신의 멤버처럼 사용할 수있다.
	 *  	-static 이너클래스를 제외하고는 다른 이너클래스는 항상 외부 클래스를 통해야 생성이 가능하다.
	 *  
	 *  3. 이너 클래스의 종류
	 * 		1.member class
	 * 			-외부클래스의 멤버변수 선언 위치에 선언하며, 외부클래스의 인스턴스 멤버처럼 다루어진다.
	 * 			주로 외부 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언된다.
	 * 		2.static class
	 * 			-외부클래스의 멤버변수 선언 위치에 선언되며, 외부클래스의 static 멤버처럼 다루어진다.
	 * 			외부클래스의 static 멤버, static 메소드에서 사용될 목적으로 선언된다.
	 * 		3.local class
	 * 			- 외부 클래스의 메소드나 초기화 블럭 안에 선언되며,
	 * 			선언된 영역 내부에서만 사용될 수 있다.
	 * 		4. anonymous class
	 * 			-클래스의 선언과 객체의 생성을 동시에 하는 이름 없는 클래스(일회용)
	 * 
	 */
	
	
    // 외부 클래스
    class OuterEx {

        // 내부 클래스
        class InnerEx {
            int x = 4;

            void aa() {
            }
        }
    }

    public static void main(String[] args) {

        // OuterEx 객체 생성
        InnerExOne ieo = new InnerExOne();
        OuterEx oe = ieo.new OuterEx();

        // InnerEx 객체 생성
        OuterEx.InnerEx oi = oe.new InnerEx();

        // 내부 클래스의 변수 사용
        System.out.println(oi.x);
    }
}