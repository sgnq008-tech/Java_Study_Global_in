package Level3;

//============================================================================
// [3번 문제] 사용자 정의 예외와 throw / throws / try-catch
//============================================================================

// Exception 클래스를 상속받아 만든 사용자 정의 예외 클래스
class OutOfStockException extends Exception {
    // 생성자: 예외 메시지를 받아 부모(Exception) 생성자로 전달
    public OutOfStockException(String message) {
        super(message);
    }
}

// 상점 클래스
class Store {
    int stock = 5; // 현재 남은 재고 수량: 5개

    // [throws 선언부]
    // "이 메서드를 실행하다가 OutOfStockException이 터지면, 나를 호출한 상위 구문으로 예외 처리를 떠넘기겠다!"
    public void order(int count) throws OutOfStockException {
        // 주문 수량이 현재 재고보다 크면 예외 발생 조건 성립
        if (count > stock) {
            // [throw 실행문]
            // new 키워드로 예외 객체를 직접 생성해서 밖으로 던짐 (에러 발생시킴)
            throw new OutOfStockException("재고가 부족합니다! (현재 재고: " + stock + ")");
        }
        // 예외가 발생하지 않으면 정상 주문 처리
        stock -= count;
        System.out.println("주문 완료! 남은 재고: " + stock);
    }
}

public class Test03 {

    // [수정] 단독 실행을 위해 run() -> 자바 표준 진입점인 main 메서드로 변경
    public static void main(String[] args) {
        Store store = new Store();

        System.out.println("=== 3번 문제 출력 ===");
        // [try-catch 예외 처리]
        // order() 메서드가 throws로 예외를 떠넘겼으므로, 호출한 쪽에서 try-catch로 감싸서 수습함
        try {
            store.order(10); // 재고(5개)보다 많은 10개 주문 시도 -> OutOfStockException 발생!
        } catch (OutOfStockException e) {
            // 예외가 던져지면 즉시 catch 블록으로 이동하여 안전하게 에러 메시지 출력 (프로그램 비정상 종료 방지)
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}