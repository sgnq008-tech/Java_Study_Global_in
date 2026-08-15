package Level1;

public class Level1Test {
	
	public static void main(String[] args) {
        System.out.println("=== 1번 결과 ===");
        Dog dog = new Dog("바둑이");
        System.out.println("강아지 이름: " + dog.name);

        System.out.println("\n=== 2번 결과 ===");
        Shape s = new Circle();
        s.draw(); // "Circle 그리기" 출력

        System.out.println("\n=== 3번 결과 ===");
        System.out.println("추상 클래스는 new로 직접 객체를 만들 수 없습니다 (O)");

        System.out.println("\n=== 4번 결과 ===");
        FlyingCar car = new FlyingCar();
        car.drive();
        car.fly();
    }
}

