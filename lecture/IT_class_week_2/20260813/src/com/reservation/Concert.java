package com.reservation;

import java.util.Scanner;

public class Concert {
	
	private Group[] groups;
	
	private Scanner sc;
	
	public Concert() {
		
		groups = new Group[3];
		
		groups[0] = new Group("S");
		groups[1] = new Group("A");
		groups[2] = new Group("B");
		
	}
	
	private int SelGrade() {

		sc = new Scanner(System.in);
		
	    while(true) {

	        System.out.print("좌석구분 S(1), A(2), B(3) : ");
	        int type = sc.nextInt();

	        if(type >= 1 && type <= 3) {
	        	
	           return type - 1;
	           
	        }

	        System.out.println("잘못된 좌석 등급입니다. 1~3 중에서 입력해주세요.");
	        
	    }
	    
	}
	
	public void reserve() {
		
		int type = SelGrade();
		
		groups[type].show(true);
		
		while(true) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("번호 : ");
			int number = sc.nextInt();
			
			if(groups[type].reserve(name, number)) {
				
				break;
				
			}
			
			System.out.println("다시 입력해주세요.");
			
		}
		
	}
	
	public void search() {
		
		for(int i = 0; i < groups.length; i++) {
			
			groups[i].show(false);
			
		}
		
		System.out.println();
		System.out.println(">>>>>>>>>>  조회를 완료 하였습니다.    <<<<<<<<<<<<");
		
	}
	
	public void cancel() {
		
		int type = SelGrade();
		
		groups[type].show(false);
		
		while(true) {
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			if(groups[type].cancel(name)) {
				
				break;
				
			}
			
			System.out.println("다시 입력해주세요.");
			
		}
		
	}
	
	public void finish() {
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void run() {
		
		sc = new Scanner(System.in);
		
		System.out.println("글로벌 인 콘서트 예약프로그램");
		System.out.println();
		
		while(true) {
			
			System.out.print("예약(1), 조회(2), 취소(3), 종료(4) : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
				case 1 :
					reserve();
					break;
				
				case 2 :
					search();
					break;
					
				case 3 :
					cancel();
					break;
					
				case 4 :
					finish();
					System.exit(0);
					
				default :
					System.out.println("잘못 입력하셨습니다.");
				
			}
			
			System.out.println();
			
		}
		
	}

}
