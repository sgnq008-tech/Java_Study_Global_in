package bank;


public class Account {
	String name;
	// 잔액
	int balance;
	
	// 생성자
	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;
	}
	
	// 매소드1
	public void deposit(int money) {
		balance += money;
		System.out.println("["+money+"]원 입금 완료! (현재 잔액: ["+balance+"원)");
	}
	// 매소드2
	public void withdraw(int money) {
		if(balance < money) {
			System.out.println("잔액이 부족하여 ["+money+"원 출금 실패!");
		}else {
			balance -= money;
			System.out.println("["+money+"]원 출금완료! [현재 잔액["+balance+"원)");
		}
		
	}
	// 매소드3
	public void addInterest(int money) 
	{
		// while문 사용하지 말고, if문 처리하기
		if(money > 10000) 
		{	
			balance +=1000;
			System.out.println("이자 1000원이 지급되었습니다.");
			// 제어문 추가하기
		}
		else 
		{
			System.out.println("10000원 미만이여서 이자가 지급되지 않았습니다");
			// 제어문 추가하기
		}		
	}
	
	

}
