package BankSystem;

public class Account {
	String name;
	int balance;
	
	// 생성자
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	//매서드1
	public void deposit(int money) {
		balance += money;
		System.out.println(name+"님"+money+"원 입금완료!"+"(현재 잔액: "+balance+"]원)");
	}
	
	//매서드2
	public void withdraw(int money) {
		if(balance < money) {
			System.out.println("잔액 부족합니다");
		}else {
			balance -=money;
			System.out.println("["+money+"]원 출금완료! (현재 잔액["+balance+"]원)");
		}
		
	}
	

}
