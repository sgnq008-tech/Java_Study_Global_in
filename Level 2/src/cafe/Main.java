package cafe;

public class Main {
    public static void main(String[] args) {
        // 1. 아메리카노 4,500원짜리 2잔 주문 객체 생성
        Order order = new Order("아메리카노", 4500, 2);

        // 2. 초기 주문 정보 출력 (4500 * 2 = 9000원)
        order.printOrderInfo();

        // 3. 수량 1잔 추가
        order.addCount(1);

        // 4. 수량 변경 후 다시 정보 출력 (4500 * 3 = 13500원)
        order.printOrderInfo();
    }
}