package com.constex;

public class ProductEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 제품 번호는 "+p1.serialNo);
		System.out.println("p2 제품 번호는 "+p2.serialNo);
		System.out.println("p3 제품 번호는 "+p3.serialNo);
		System.out.println("만즐어진 제품 수는 "+Product.count+"개 입니다.");

	}

}
