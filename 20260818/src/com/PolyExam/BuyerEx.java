package com.PolyExam;

public class BuyerEx {
	int money = 1000;
	int bonusPoint = 0;
	
	//구매한 제품을 저장하기 위한 객체배열을 선언
	Product[] item = new Product[10];
	int i = 0;//product 배열을 카운터할 변수
	
	public void buy (Product p)
	{
		if(money < p.price)
		{
			System.out.println("가진 돈이 없어 물건을 살수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;// 제품을 product 배열에 저장함
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	//구입한 제품을 정보를 출력
	public void summary() {
		int sum = 0;
		String itemList = ""; // 구매한 제품 목록을 저장할 변수
		
		// 반복문을 활용해서 구매한 제품의 총 가격과 목록을 만듬
		for(int i = 0; i <item.length; i++)
		{
			if(item[i] ==null) break;
			sum+=item[i].price;
			itemList += item[i]+" ";
		}
		System.out.println("구매한 제품을 총 금액은"+sum+"만원입니다.");
		System.out.println("구매한 제품 목록은"+itemList+"만원입니다.");
	}
	

}
