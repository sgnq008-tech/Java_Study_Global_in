package com.inherex2;

public class CastingExam02 {

	public static void main(String[] args) {
		//Car car = new Car();
		Car car = new CFireEngine();
		Car car2 = null;
		CFireEngine fe = null;
		car.drive();
		fe = (CFireEngine)car; 
		/* 컴파일시에는 참조변수간의 타입만 체크하기 때문에 실행시 생성될 
		 * 인스턴스의 타입에 대해서는 전혀 알지 못하기때문이다.
		 * 그래서 컴파일시에 문제가 없지만, 실행시에는 문제 발생한다.
		 */
		fe.drive();
		car2 = fe;
		car2.drive();
		
		/*서로 상속관계에 있는 타입간의 형변환은 양방향으로 자유롭게 수행될 수 있으나,
		 * 참조 변수가 가르기는 인스턴스의 자손타입으로 형변환은 허용하지 않는다.
		 * 그래서 참조 변수가 가리키는 인스턴스의 타입이 무엇인지 확인하여 정확하게
		 * 명시 해야한다.
		 */
	

	}

}
