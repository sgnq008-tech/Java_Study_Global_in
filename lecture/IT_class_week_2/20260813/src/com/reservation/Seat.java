package com.reservation;

public class Seat {
	
	// 예약자 이름
	private String name;
	
	// 예약 기능
	public void reserve(String name) {
		
		this.name = name;
		
	}
	
	// 취소 기능
	public void cancel() {
		
		this.name = null;
		
	}
	
	// 좌석이 예약되었는지 판별 기능
	public boolean isOccupied() {
		
		return name != null;
		
	}
	
	// 예약자가 있는지 판별 기능
	public boolean match(String name) {
		
		return this.name != null && this.name.equals(name);
		
	}

	// 예약자 이름 가져오기
	public String getName() {
		
		return name;
		
	}
	
}
