package Poley;

// ==========================================
// 1. 부모 클래스 (Shape)
// ==========================================
class Shape {
    void draw() {
        System.out.println("도형을 그립니다.");
    }
}

// ==========================================
// 2. 자식 클래스 1 (Circle)
// ==========================================
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("동그라미 ◯를 그립니다.");
    }
}

// ==========================================
// 3. 자식 클래스 2 (Rectangle)
// ==========================================
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("네모 ▢를 그립니다.");
    }
}

// ==========================================
// 4. 실행 메인 클래스
// ==========================================
class PolyLevel1 {
    public static void main(String[] args) {
        
        System.out.println("=== [다형성 적용 1] ===");
        // Shape 타입 변수로 선언했지만 실제 객체는 Circle
        Shape s1 = new Circle();
        
        // [출력] 동그라미 ◯를 그립니다.
        // [해설] Circle에서 오버라이딩한 draw()가 호출됨
        s1.draw();


        System.out.println("\n=== [다형성 적용 2] ===");
        // Shape 타입 변수로 선언했지만 실제 객체는 Rectangle
        Shape s2 = new Rectangle();
        
        // [출력] 네모 ▢를 그립니다.
        // [해설] Rectangle에서 오버라이딩한 draw()가 호출됨
        s2.draw();
    }
}