package com.collectionex;

/*문]
 *  이름을 4개 입력받아 ArrayList에 저장하고 
 *  모두 출력한 후 제일 긴 이름을 출력하는 프로그램을 구현하시오.
 * 
 * 	결과
 *  이름 입력 : 신유
 *  이름 입력 : 도훈
 *  이름 입력 : 영재
 *  이름 입력 : 한진
 *  이름 입력 : 휴지훈
 *  이름 입력 : 경민
 *  
 *  신유 도훈 영재 한진 휴지훈 경민
 *  가장 긴 이름 : 휴지훈
 * 
 */
import java.util.*;
public class ArrayListEx03 {

	public static void main(String[] args) {
	
		ArrayList<String>a = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i <6; i++) {
			System.out.print("이름 입력 : ");
			String name = sc.next();
			a.add(name);
		}
		//ArrayList에 저장된 모든 이름을 출력
		for(int i = 0; i < a.size();i++) {
			String name = a.get(i);
			System.out.println(name+" ");
		}

		//가장 긴 이름 출력
		//현재 가장 긴 이름이 있는 인덱스
		int longIndex = 0;
		for(int i = 1; i <a.size();i++) {
			if(a.get(longIndex).length()<a.get(i).length()) {
				//첫번째 인덱스와 다음 인덱스의 이름, 길이 비교
				longIndex = i; //i번째 이름이 더 긴 이름일때 인덱스를 저장한다. 
			}
		}
		
		System.out.println("가장 긴 이름 : "+a.get(longIndex));
	}

}
