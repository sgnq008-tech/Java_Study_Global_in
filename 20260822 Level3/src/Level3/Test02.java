package Level3;

// [수정 1] List, ArrayList를 사용하기 위한 import문 추가
import java.util.ArrayList;
import java.util.List;

// 부모 클래스: 일반 알림 클래스
class Notification {
    public void send() {
        System.out.println("일반 알림을 전송합니다.");
    }
}

// 자식 클래스 1: 이메일 알림 (오버라이딩)
class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("이메일을 발송합니다.");
    }
}

// 자식 클래스 2: SMS 알림 (오버라이딩)
class SmsNotification extends Notification {
    @Override
    public void send() {
        System.out.println("SMS 문자를 발송합니다.");
    }
}

// 파일명과 동일하게 public 클래스로 두고 main 메서드 제공
public class Test02 {
    
    // [수정 2] 단독 실행을 위해 run() -> main(String[] args)으로 변경
    public static void main(String[] args) {
        // 부모 타입(Notification)으로 제네릭 리스트 생성 (다형성 활용)
        List<Notification> list = new ArrayList<>();

        // 업캐스팅(Upcasting): 자식 객체들을 부모 타입 리스트에 저장
        list.add(new EmailNotification()); // EmailNotification -> Notification
        list.add(new SmsNotification());   // SmsNotification -> Notification

        System.out.println("=== 2번 문제 출력 ===");
        // 향상된 for문으로 리스트 요소 순회
        for (Notification n : list) {
            // [동적 바인딩 (Dynamic Binding) 발생]
            // n의 타입은 부모(Notification)이지만, 실제 힙에 생성된 자식 객체의 send()가 호출됨
            n.send();
        }
        System.out.println();
    }
}