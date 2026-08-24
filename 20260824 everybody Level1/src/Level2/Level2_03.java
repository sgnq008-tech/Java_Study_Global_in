package Level2;

class Car {
    // 인스턴스 멤버 변수 (객체 고유의 속성)
    String model;
    int speed;

    // 생성자: 매개변수 이름과 인스턴스 변수 이름이 같을 때 this 키워드로 구분함
    public Car(String model, int speed) {
        // [정답 (A)]
        // this.model: 이 객체(Car)의 멤버 변수 model을 가리킴
        // model: 외부에서 전달받은 매개변수 model을 가리킴
        this.model = model;
        this.speed = speed;
    }

    // 자동차 정보 출력 메서드
    public void printInfo() {
        System.out.println(model + " (속도: " + speed + "km/h)");
    }
}

public class Level2_03 {
    public static void main(String[] args) {
        // "아반떼", 80 값을 넘겨주며 Car 객체 생성
        Car myCar = new Car("아반떼", 80);
        
        // 출력 결과: 아반떼 (속도: 80km/h)
        myCar.printInfo();
    }
}