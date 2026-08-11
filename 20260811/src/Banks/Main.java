package Banks;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account("김철수", 8000);

        acc.deposit(3000);  // 8000 + 3000 = 11000원
        
/*
* acc 객체가 만들어질 때 이름과 잔액을 이미 자기 변수(name, balance)에 저장해 두었기 때문입니다. 
* checkVIP()는
* 자기 몸속에 있는 변수를 바로 꺼내서 확인하면 되므로, 
* 파라미터() 안에 외부 재료(매개변수)를 따로 전달받을 필요없다*/
        acc.checkVIP();     // 10000원 이상이므로 VIP 출력
        acc.withdraw(15000); // 잔액 부족 출금 실패
    }
}