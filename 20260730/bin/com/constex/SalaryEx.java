package com.constex;

public class SalaryEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary();
		s.setPay(1000,"1234");
		
		int myPay = s.getPay();
		
		System.out.println("계좌에 입금한 금액 : "+myPay);
		
		
		
	}

}
