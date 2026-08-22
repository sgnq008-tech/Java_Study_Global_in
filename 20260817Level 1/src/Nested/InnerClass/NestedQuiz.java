package Nested.InnerClass;

// 외부 클래스 (Outer Class)
class OuterClass {
    private int secretCode = 777; // private 바깥 변수

    // 내부 클래스 (Inner Class)
    class InnerClass {
        void printSecret() {
            // 내부 클래스에서는 외부 클래스의 private 변수에 직접 접근 가능!
            System.out.println("외부 클래스의 비밀번호: " + secretCode);
        }
    }

    // 외부 클래스 안에서 내부 클래스 객체를 만들어 실행하는 메서드
    void showInner() {
        InnerClass inner = new InnerClass();
        inner.printSecret();
    }
}

class NestedQuiz {
    public static void main(String[] args) {
        
        OuterClass outer = new OuterClass();
        
        // ❓ [Q1] 아래 코드를 실행했을 때 출력되는 문장은 무엇일까요?
        outer.showInner();
    }
}