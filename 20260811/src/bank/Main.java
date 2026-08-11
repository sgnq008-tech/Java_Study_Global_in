package bank;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("김철수", 8000);

        System.out.println("=== 1. 입금 및 출금 테스트 ===");
        acc.deposit(3000); // 8000 + 3000 = 11000원
        acc.withdraw(15000); // 실패해야 함

        System.out.println("\n=== 2. 이자 지급 테스트 ===");
        acc.addInterest(acc.balance); // 현재 11000원이므로 이자 1000원 지급되어 12000원
        
    }
}