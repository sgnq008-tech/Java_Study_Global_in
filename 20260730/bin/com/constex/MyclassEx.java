package com.constex;

public class MyclassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass m = new Myclass();
		Myclass m1 = new Myclass("아라치");
		Myclass m2 = new Myclass("마루치",46);
		Myclass m3 = new Myclass(23,"오자바");
		
		System.out.println("이름 : "+m.getName()+", 나이 : "+m.getAge());
		System.out.println("이름 : "+m1.getName()+", 나이 : "+m1.getAge());
		System.out.println("이름 : "+m2.getName()+", 나이 : "+m2.getAge());
		System.out.println("이름 : "+m3.getName()+", 나이 : "+m3.getAge());
		
		
		

	}

}
