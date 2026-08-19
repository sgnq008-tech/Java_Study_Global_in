package com.PolyExam;

class Buyer {//제품을 사는 사람, 고객 
	int money = 1000;
	int bonusPoint = 0;
	
	public void buy (Product p)
	{//매개 변수의 다형성
		if(money < p.price)
		{
			System.out.println("금액이 부족하여 제품을 살수가 없습니다.");
			return;
		}
		//가진돈에서 구입한 제품의 가격을 뺀다.
		money-= p.price;
		bonusPoint += p.bonusPoint; // 제품의 보너스 점수가 추가된다.
		System.out.println(p+"을/를 구입하셨습니다.");
	}

}
