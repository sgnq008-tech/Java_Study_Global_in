package com.inherex;

public class CastingExam02 {

	public static void main(String[] args) {
		
		// 에러 원인
		// Car car = new Car();
		
		// 이렇게 하면 에러 안 남
		Car car = new FireEngine();
		
		Car car2 = null;
		
		FireEngine fe = null;
		
		car.drive();
		
		fe = (FireEngine)car;
		/*
		 * 컴파일 시에는 참조변수 간의 타입만 체크하기 때문에 실행 시 생성 될
		 * 인스턴스의 타입에 대해서는 전혀 알지 못하기 때문임
		 * 그래서 컴파일 시에는 문제가 없지만, 실행 시에는 문제 발생
		 */
		
		fe.drive();
		
		car2 = fe;
		
		car2.drive();
		
		/*
		 * 서로 상속 관계에 있는 타입 간의 형변환은 양방향으로 자유롭게 수행될 수 있으나,
		 * 참조변수가 가리키는 인스턴스의 자손 타입으로 형변환은 허용하지 않음
		 * 그래서 참조변수가 가리키는 인스턴스의 타입이 무엇인지 확인하여 정확하게 명시해야 함
		 */

	}

}
