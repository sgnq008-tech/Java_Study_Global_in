package Interface;

// 1. 원격 제어 규격(인터페이스) 정의
interface RemoteControl {
    void turnOn();  // 가전 제품을 켠다
    void turnOff(); // 가전 제품을 끈다
}

// 2. 인터페이스를 구현(implements)하는 Television 클래스
class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원이 꺼졌습니다.");
    }
}

class InterfaceQuiz {
    public static void main(String[] args) {
        
        // 인터페이스 타입 변수에 구현 클래스 객체 대입
        RemoteControl rc = new Television();
        
        // ❓ [Q1] 아래 코드를 실행하면 어떤 문장이 출력될까요?
        rc.turnOn();
        rc.turnOff();
    }
}