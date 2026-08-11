package Banks;

public class Account {
	String name;
	int balance;
	
	public Account(String name, int balance) 
	{
		this.name = name;
		this.balance = balance;
	}
	
	// 입금 메서드
	public void deposit(int money) 
	{
		balance += money;
		System.out.println("["+money+"]원 입금 완료! (잔액: ["+balance+"]원)");
	}
	
	// 출금 메서드
	public void withdraw(int money) {
		if(balance < money) 
		{
			System.out.println("잔액이 부족하여 ["+money+"]원 출금 실패!");
		}else 
		{
			balance -= money;
			System.out.println("["+money+"]원 출금 완료! (잔액: ["+balance+"]원)");
		}
	}
	
	public void checkVIP() {
		if(balance >= 10000) 
		{
			System.out.println("["+name+"]님은 VIP 고객입니다.");
		}else 
		{
			System.out.println("["+name+"]님은 일반고객입니다.");
		}
	}
	

}
