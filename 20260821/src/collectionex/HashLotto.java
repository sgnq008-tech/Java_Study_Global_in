package com.collectionex;

import java.util.*;

public class HashLotto {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("수량을 입력하세요: ");
	        int num = sc.nextInt(); // num 변수 선언 및 입력 받기

	        for (int k = 0; k < num; k++) {
	            Set<Integer> set = new HashSet<>(); // 매 회차마다 새 Set 생성

	            while (set.size() < 6) { // 중복 없이 6개가 채워질 때까지 반복
	                int n = (int) (Math.random() * 45) + 1;
	                set.add(n);
	            }

	            List<Integer> list = new LinkedList<>(set);
	            Collections.sort(list);
	            System.out.println(list);
	        }
	        
	        sc.close();
	    }
}
