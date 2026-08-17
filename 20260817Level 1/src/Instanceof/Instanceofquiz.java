package Instanceof;

// 부모 클래스
class Vehicle {
    void drive() {
        System.out.println("탈것이 이동합니다.");
    }
}

// 자식 클래스 1
class Airplane extends Vehicle {
    void fly() {
        System.out.println("비행기가 하늘을 납니다.");
    }
}

// 자식 클래스 2
class Submarine extends Vehicle {
    void dive() {
        System.out.println("잠수함이 물속으로 잠수합니다.");
    }
}

class Instanceofquiz {
    public static void main(String[] args) {
        
        Vehicle v1 = new Airplane();
        Vehicle v2 = new Submarine();

        System.out.println("=== 1. 타입 검사 결과 ===");
        System.out.println("v1 instanceof Airplane: " + (v1 instanceof Airplane)); // true
        System.out.println("v1 instanceof Submarine: " + (v1 instanceof Submarine)); // false

        System.out.println("\n=== 2. 안전한 다운캐스팅 실습 ===");
        // instanceof를 통해 v2의 실제 타입이 Submarine인지 검사
        if (v2 instanceof Submarine) {
            // 부모 타입(Vehicle)에서 자식 타입(Submarine)으로 다운캐스팅하여 dive() 호출
            ((Submarine) v2).dive();
        }
    }
}