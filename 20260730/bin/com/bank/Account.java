package com.bank;

public class Account {
	
	private String name;// 계좌의 소유주 이름 
	private long balance;// 현재 잔액을 저장하는 변수
	
	public Account() {}
	public Account(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public long getBalance() {
		return balance;
	}
	
	public void deposit(long amount) {//입금기능
		balance += amount;
		
	}
	
	public void withdraw(long amount) {//출금기능
		if(balance < amount)
			System.out.println("현재 계좌에 잔액이 없슴");
		else
			balance -= amount;
	}
	
	
	
}
