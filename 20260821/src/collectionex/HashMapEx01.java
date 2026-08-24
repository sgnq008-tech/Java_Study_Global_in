<<<<<<< HEAD
package com.collectionex;
import java.util.*;
public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("miId", "1234");
		map.put("asdf", "1234");
		map.put("asdf", "12234");
		
		
		//System.out.println(map);
		
		while(true) {
			System.out.println("id와 pasw를 입력해 주세요 .");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {//아이디가 맵에 포합외더 있지 않으면
				System.out.println("입력하신 id는 존재하지 않습니다 ");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치 하지 안 ");
			}else {
				System.out.println("아이디와 비밀번호가 일치합니다 ");
				return;
			}
			
			
			
			
		}
		
	
		
		
		
		
	}

}
=======
package com.collectionex;
import java.util.*;
public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("miId", "1234");
		map.put("asdf", "1234");
		map.put("asdf", "12234");
		
		
		//System.out.println(map);
		
		while(true) {
			System.out.println("id와 pasw를 입력해 주세요 .");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("password : ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {//아이디가 맵에 포합외더 있지 않으면
				System.out.println("입력하신 id는 존재하지 않습니다 ");
				continue;
			}
			
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치 하지 안 ");
			}else {
				System.out.println("아이디와 비밀번호가 일치합니다 ");
				return;
			}
			
			
			
			
		}
		
	
		
		
		
		
	}

}
>>>>>>> 2fccac690dfcf427d52b9e91be42eb2ada05ab5b
