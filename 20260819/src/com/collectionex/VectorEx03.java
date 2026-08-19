package com.collectionex;
import java.util.*;
public class VectorEx03 {

	private static final String colors[]=
		{"검정","노랑","주황","파랑","연두색","보라색"};
	
	public static void main(String[] args) {
		Vector<String>v = new Vector<String>();
		
		for(String str : colors)
			v.add(str);
		
		System.out.println("첫번째 요소 : "+v.firstElement());
		System.out.println("두번째 요소 : "+v.get(1));
		System.out.println("마지막 요소 : "+v.lastElement());

		//첫번째 요소를 흰색으로 변경
		v.set(0, "흰색");
		System.out.println("첫번째 요소 : "+v.firstElement());
		System.out.println("요소의 개수 : "+v.size());
		
		//첫번째 요소에 빨강을 추가
		v.insertElementAt("빨강", 0);
		System.out.println("첫번째 요소 : "+v.firstElement());
		System.out.println("요소의 개수 : "+v.size());
		
		//전체 출력
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		//오름차순 정렬
		Collections.sort(v);
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		//검색
		int idx = Collections.binarySearch(v, "연두색");
		System.out.println("연두색 : "+idx+ "index에 위치");
		
		
		//내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		//내림 차순 후 검색
		idx = Collections.binarySearch(v,"보라색",Collections.reverseOrder());
		System.out.println("보라색 : "+idx+ "index에 위치");
		//검색 데이터가 존재하지 않으면 음수를 출력함
		
		//삭제
		v.remove(0);
		v.remove("빨강");
		System.out.println("삭제 후 출력 : ");
		for(String str : v) {
			System.out.print(str + " ");
		}
		System.out.println();
		
	}


}
