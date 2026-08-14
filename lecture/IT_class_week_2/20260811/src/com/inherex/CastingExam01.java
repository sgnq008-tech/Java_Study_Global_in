package com.inherex;

public class CastingExam01 {

	public static void main(String[] args) {
		
		// 부모 클래스
		Car car = null;
		
		// 자식 클래스
		FireEngine fe = new FireEngine();
		
		// 자식 클래스
		FireEngine fe2 = null;
		
		fe.water();
		
		// car = (Car)fe; 에서 형변환이 생략된 형태
		car = fe;
		
		// 컴파일 에러
		// car.water();
		// Car 타입의 참조변수로는 water() 메서드를 호출할 수 없음
		
		// 자식 클래스 <- 조상 클래스
		fe2 = (FireEngine)car;
		/*
		 * 참조변수 car 가 참조하고 있는 인스턴스를 참조변수 fe2 가 참조하도록 함
		 * 이때, 두 참조변수의 타입이 서로 다르기 때문에 참조변수 car 를 형변환해야 함
		 * car 에는 FireEngine 인스턴스의 주소가 저장되어 있기 때문에 fe2 에도 FireEngine
		 * 인스턴스의 주소가 저장
		 */
		
		fe2.water();

	}

}
