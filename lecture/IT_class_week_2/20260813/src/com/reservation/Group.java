package com.reservation;

public class Group {
	
	// 좌석의 등급
	private String grade;
	
	// 좌석의 객체 배열
	private Seat[] seats;
	
	// 등급에 따른 좌석 객체 배열 생성 기능
	public Group(String grade) {
		
		this.grade = grade;
		
		seats = new Seat[10];
		
		for(int i = 0; i < seats.length; i++) {
			
			seats[i] = new Seat();
			
		}
		
	}
	
	// 좌석 예약 기능
	public boolean reserve(String name, int number) {
		
		if(number < 1 || number > 10) {
			
           System.out.println("잘못된 좌석 번호입니다.");
           
           return false;
           
        }

        if(seats[number - 1].isOccupied()) {
        	
           System.out.println("이미 예약된 좌석입니다.");
           
           return false;
           
        }
		
		seats[number - 1].reserve(name);
		
		return true;
		
	}
	
	// 예약 취소 기능
	public boolean cancel(String name) {
		
		for(int i = 0; i < seats.length; i++) {
			
			if(seats[i].match(name)) {
				
				seats[i].cancel();
				
				return true;
				
			}
			
		}
		
		System.out.println("해당 이름의 예약이 없습니다.");
		
		return false;
		
	}
	
	// 현재 등급 좌석 출력 기능
	public void show(boolean showNumber) {

	    System.out.print(grade + " : ");

	    for(int i = 0; i < seats.length; i++) {

	        if(seats[i].isOccupied()) {
	        	
	           System.out.print(seats[i].getName() + " ");
	           
	        }else {
	        	
	           System.out.print("--- ");
	           
	        }
	        
	    }

	    System.out.println("현재 " + grade + "석 상태");

	    if(showNumber) {
	    	
	    	System.out.print("     ");

		    for(int i = 1; i <= 10; i++) {
		    	
		        System.out.printf("%-4d", i);
		       
		    }

		    System.out.println();
		    
		}
	    	
	}

}
