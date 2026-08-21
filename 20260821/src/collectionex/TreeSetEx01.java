package com.collectionex;

import java.util.*;
public class TreeSetEx01 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to ="d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		
		set.add("car");
		set.add("Car");
		set.add("disc");
		
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		
		set.add("elepllpf");
		set.add("eleppffk");
		set.add("fan");
		
		set.add("f;pwe");
		
		System.out.println(set);
		
		System.out.println("부분검색 : from "+from+" to "+to);
		System.out.println("결과 1 : "+set.subSet(from, to));
		System.out.println("결과 2 : "+set.subSet(from, to+"zzz"));
		
		
		
	
	}
}
