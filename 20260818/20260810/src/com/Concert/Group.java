package com.Concert;
import java.util.*;
public class Group {
//S, A, B 석을 나타내느 문자
	private char type;
	private Seat[] seats;
	private Scanner sc;
	
	public Group(char type, int num)
	{
		this.type=type;
		seats = new Seat[num];
		for(int i = 0; i<seats.length; i++)
		{
			seats[i] = new Seat();
		}
		sc= new Scanner(System.in);
	}
	
	public boolean reserve()
	{
		int no;
		String name;
		show();
		System.out.println("이름: ");
		name = sc.next();
		
		System.out.println("번호: ");
		no = sc.nextInt();
		
		if(no < 1 || no>= seats.length)
		{
			System.out.println("잘못된 좌석입니다.");
			return false;			
		}
		
		// 좌석 이미 예약되어 있으면
		if(seats[no-1].isOccupied())
		{
			System.out.println("이미 예약된 좌석입니다.");
			return false;
		}
		//예약 가능
		seats[no-1].reserve(name);
		//예약이 성공했으므로 true리턴한다.
		return true;
	}
	//현재 그룹의 좌석을 취소하는 기능
	public boolean cancel()
	{
		show();
		System.out.print("이름:");
		String name = sc.next();
		if(name != null) 
		{
			for(int i = 0; i< seats.length; i++)
			{
				if(seats[i].match(name))
				{
					seats[i].cancel();
					return true;
				}
			}
			System.out.println();
		}
	return false;
	}
	
	public void show()
	{
		System.out.println(type+" : ");
		for(int i = 0; i < seats.length; i++)
			if(seats[i].isOccupied())
			{
				System.out.print(seats[i].getName());
			}else
			{
				System.out.print("---");
			}
			System.out.println(" ");
	}
}
