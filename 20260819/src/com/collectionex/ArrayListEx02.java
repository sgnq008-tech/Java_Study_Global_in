package com.collectionex;
import java.util.*;
public class ArrayListEx02 {

	public static void main(String[] args) {
		final int LIMIT = 10; //자르고자 하는 글자의 개수를 지정한 상수
		
		String source= "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
		int length = source.length();
		
		List list = new ArrayList(length/LIMIT+ 10);
		
		//list에 source를 저장함
		for(int i = 0; i <length; i+=LIMIT) {
			if(i+LIMIT<length) {
				list.add(source.subSequence(i, i+LIMIT));
			}else {
				list.add(source.substring(i));
			}
		}
			//출력
			for(int i = 0; i < list.size();i++) {
				System.out.println(list.get(i));
			}
		
	}

}
