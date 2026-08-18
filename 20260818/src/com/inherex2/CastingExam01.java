package com.inherex2;

public class CastingExam01 {

	public static void main(String[] args) {
		Car car = null;
		CFireEngine fe = new CFireEngine(); //자식클래스
		CFireEngine fe2 = null;// 자식클래스
		fe.water();
		car= fe;// car = (Car)fe; 에서 형 변환이 생략된 형태임
		//car.water(); // 컴파일 에러 Car 타입의 참조 변수로는 water() 메소드를 호출 할 수없다.
		fe2 = (CFireEngine)car;//자식클래스 <- 조상 클래스
		
		/*참조변수 car 가 참조하고 있는 인스턴스를 참조 변수 fe2가 참조하도록 한다.
		 * 이때 두 참조 변수의 타입이 서로 다르기 때문에 참조변수 car을 형변환 해야한다.
		 * car 에는 FireEngine인스턴스의 주소가 저장되어 있기 때문에 fe2에도 fire변수 FireEngine
		 * 인스턴스의 주소가 저장된다.
		 */
		fe2.water();

	}

}
