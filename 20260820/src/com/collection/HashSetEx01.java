package com.collection;

import java.util.*;

public class HashSetEx01 {

	public static void main(String[] args) {

		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		Set set = new HashSet();
		
		for(int i = 0; i< objArr.length; i++) {
			set.add(objArr[i]); //set에 대이터 저장
		}
		//set에 저장된 데이터 출력
		System.out.println(set);

	}

}
