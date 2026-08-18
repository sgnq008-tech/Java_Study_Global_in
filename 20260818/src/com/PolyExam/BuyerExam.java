package com.PolyExam;
import java.util.*;
public class BuyerExam {
	int money = 1000;
	int bonusPoint =0;
	
	// 구매한 제품을 저장할 Vector 객체를 선언
	Vector item = new Vector();
	
	public void buy(Product p)
	{
		if(money < p.price)
		{
			System.out.println("금액이 부족하여 제품을 살수가 없습니다.");
			return;
		}
		//가진돈에서 구입한 제품의 가격을 뺀다.
		money-= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	// 환불 기능
	public void refund(Product p)
	{
		//제품을 Vector에서 제거함 -> remove
		if(item.remove(p))
		{
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을/를 반품 하셨습니다.");
		} else {
			//반품이 안된경우 
			System.out.println("구입한 제품이 없습니다.");
		}
	}


//구입한 제품에 대한 정보를 요약해서 출력한다.
public void summary()
{
	int sum = 0;
	String itemList = "";
	if(item.isEmpty())
	{//Vector 가 비어 있는지를 확인하는 기능
		System.out.println("구입하신 제품이 없습니다.");
		return ; 
	}
	
// 반복문을 이용해서 구입한 제품을 총금액과 목록을 만듬
	for(int i = 0; i < item.size();i++)
	{					//부모의 객체로 형변환
		Product p = (Product)item.get(i);
		sum += p.price;
		itemList += (i == 0) ?""+p:","+p;
	}
	
	System.out.println("구매한 물품의 총금액은"+sum+"만원입니다.");
	System.out.println("구매한 제품은"+itemList+"입니다.");
}
	
	
}


