package com.collectionex;
import java.util.*;
public class VectorEx01 {
	
	private static final String colors[] = 
		{"검정", "노랑","녹색","파랑","주황색","연두색"};
	

	public static void main(String[] args) {
	
		int i ;
		String str;
		Vector<String> v = new Vector<>();
		
		
		for(i = 0 ; i < colors.length; i++) {
			v.add(colors[i]);
		}

		//첫번째 값 출력
		str = v.firstElement();
		System.out.println("첫번째 요소 : "+str);
		//두번째 값 출력
		str = v.get(1);
		System.out.println("두번째 요소 : "+str);
		//마지막 값 출력
		str = v.lastElement();
		System.out.println("마지막 요소 : "+str);
		
		
		//전체 출력
		System.out.print("전체 출력 : ");
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			str =it.next();
			System.out.print(str +" ");
		}
		System.out.println();
		for(String s : v) {
			str = s;
			System.out.print(str+" ");
		}
	}

}
