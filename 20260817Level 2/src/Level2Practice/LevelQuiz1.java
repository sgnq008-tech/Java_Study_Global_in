package Level2Practice;

class Vehicle2 {
    String name = "일반 탈것";

    void move() {
        System.out.println("탈것이 이동합니다.");
    }
}

class Bus2 extends Vehicle2 {
    String name = "시내버스"; // 부모와 동일한 이름의 변수

    @Override
    void move() {
        System.out.println("버스가 정류장 사이를 달립니다.");
    }

    void checkFare() {
        System.out.println("승차 요금을 결제합니다.");
    }
}

class Level2Quiz1 {
    public static void main(String[] args) {
        // 부모 타입 변수에 자식 객체 저장 (업캐스팅)
        Vehicle2 v = new Bus2();

        // ❓ [Q1-1] 아래 실행 시 v.name은 "일반 탈것"과 "시내버스" 중 무엇이 출력될까요?
        System.out.println("탈것 이름: " + v.name);

        // ❓ [Q1-2] 아래 실행 시 "탈것이 이동합니다."와 "버스가 정류장 사이를 달립니다." 중 무엇이 출력될까요?
        v.move();

        // ❓ [Q1-3] v.checkFare(); 를 바로 호출하면 에러가 납니다. 안전하게 호출하려면 어떻게 작성해야 할까요?
        if (v instanceof Bus2) {
            ((Bus2) v).checkFare();
        }
    }
}