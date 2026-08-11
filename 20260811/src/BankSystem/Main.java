package BankSystem;

public class Main {
    public static void main(String[] args) {
        // 1. 홍길동 이름으로 10,000원 계좌 생성
        Account myAcc = new Account("홍길동", 10000);

        // 2. 5,000원 입금 테스트
        myAcc.deposit(5000);

        // 3. 3,000원 출금 테스트 (성공)
        myAcc.withdraw(3000);

        // 4. 20,000원 출금 테스트 (잔액 부족으로 실패해야 함)
        myAcc.withdraw(20000);
    }
}