package com.constex;

public class Product {
	
	
	
	static int count = 0;
	int serialNo;
	
	{// product 인스턴스가 생성될때마다 count의 값을 1씩 증가시켜서 serialNo에 저장 
		count++;
		serialNo =count;
	}
	
	
	
	
	
	
	

}
