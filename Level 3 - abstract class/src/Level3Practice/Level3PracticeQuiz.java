package Level3Practice;

// ==========================================
// [문제 1] 추상 클래스와 super 메서드 호출
// ==========================================
// 💡 수정: 클래스 이름을 Level3PracticeQuiz에서 Device로 변경 (이름 중복 해결)
abstract class Device {
    void powerOn() {
        System.out.println("기기 전원이 켜집니다.");
    }
    
    // 자식이 반드시 구현해야 하는 추상 메서드
    abstract void display();
}

class SmartPhone extends Device {
    @Override
    void powerOn() {
        super.powerOn(); // 부모(Device) 메서드 먼저 호출 -> "기기 전원이 켜집니다."
        System.out.println("스마트폰 화면이 백라이트를 켭니다.");
    }

    @Override
    void display() {
        System.out.println("OLED 디스플레이 출력 중...");
    }
}


// ==========================================
// [문제 2] 인터페이스 다중 구현과 타입 참조 범위
// ==========================================
interface Flyable {
    void fly();
}

interface Navigable {
    void navigate();
}

class SeaPlane implements Flyable, Navigable {
    @Override
    public void fly() {
        System.out.println("수상비행기가 하늘을 비행합니다.");
    }

    @Override
    public void navigate() {
        System.out.println("수상비행기가 수면 위를 항해합니다.");
    }
}


// ==========================================
// [문제 3] 다형성 배열과 안전한 다운캐스팅 (instanceof)
// ==========================================
abstract class PaymentService {
    abstract void processPay();
}

class CreditCardPay extends PaymentService {
    @Override
    void processPay() {
        System.out.println("신용카드 결제가 완료되었습니다.");
    }

    // 카드 전용 취소 메서드
    void cancelCardPay() {
        System.out.println("신용카드 결제가 승인 취소되었습니다.");
    }
}

class CashPay extends PaymentService {
    @Override
    void processPay() {
        System.out.println("현금 영수증 발행 후 현금 결제가 완료되었습니다.");
    }
}


// ==========================================
// 실행 메인 클래스 (파일명: Level3PracticeQuiz.java)
// ==========================================
public class Level3PracticeQuiz {
    public static void main(String[] args) {
        
        System.out.println("=== [문제 1 정답 실행 결과] ===");
        Device myPhone = new SmartPhone();
        myPhone.powerOn();
        /*
         * [Q1 정답 & 해설]
         * 기기 전원이 켜집니다.
         * 스마트폰 화면이 백라이트를 켭니다.
         * 
         * -> SmartPhone의 powerOn() 내부에서 super.powerOn()을 먼저 불렀기 때문에 
         *    부모 문구가 1번째, 자식 문구가 2번째로 출력됩니다.
         */


        System.out.println("\n=== [문제 2 정답 실행 결과] ===");
        Flyable f = new SeaPlane();
        f.fly(); // 출력: 수상비행기가 하늘을 비행합니다.
        
        // f.navigate(); // ❌ 바로 부르면 컴파일 에러 발생!
        // [Q2 정답 & 해설]
        // 이유: 변수 f의 타입(껍데기)이 Flyable이라 navigate() 기능의 존재를 모릅니다.
        // 해결: 아래처럼 Navigable이나 SeaPlane으로 형변환(다운캐스팅)하면 정상 실행됩니다.
        ((Navigable) f).navigate(); // 출력: 수상비행기가 수면 위를 항해합니다.


        System.out.println("\n=== [문제 3 정답 실행 결과] ===");
        PaymentService[] payments = new PaymentService[2];
        payments[0] = new CreditCardPay();
        payments[1] = new CashPay();

        for (PaymentService p : payments) {
            p.processPay();
            
            // [Q3 정답 & 해설]
            // A: instanceof (실제 객체 타입을 확인하는 연산자)
            // B: CreditCardPay (카드 전용 메서드를 호출하기 위한 형변환)
            if (p instanceof CreditCardPay) {
                ((CreditCardPay) p).cancelCardPay();
            }
        }
    }
}