package MonthScheduleDay;
/*
 * 
 * 문]
 * 		MonthSchedule 클래스에서는 Day객체 배열과 적절한 필드와 메소드를 작성하고
 * 		실행 결과 처럼 입력 , 보기 , 끝내기 등의 3개의 기능을 완성하시오.
 * 		 
 * 		결과
 * 		이번달 스케줄 관리 프로그램 
 * 		할일 (입력 : 1, 보기 : 2, 끝내기 : 3) >> 1
 * 		날짜(1~30) : 1
 * 		할일(빈칸없이) : 자바공부
 * 	
 * 		 		
 * 		할일 (입력 : 1, 보기 : 2, 끝내기 : 3) >> 2
 * 		날짜(1~30) : 1
 * 		1일의 할일은 자바공부 입니다
 * 
 * 		할일 (입력 : 1, 보기 : 2, 끝내기 : 3) >> 3
 * 		프로그램을 종료합니다.		
 *  
 * 			
 * 		MonthSchedule에는 생성자 , input(), view(),finish(),run() 메소드를 만들고 
 * 		main() 메소드에서 run() 메소드를 호출하여 메뉴를 출력하고 처리한다.
 * 
 */


import java.util.*;

public class MonthSchedule {
	
	private Scanner sc;
	private int nDays;
	private Day[] days;
	
	//생성자
	public MonthSchedule(int nDays) {
		//한달의 날짜 초기화
		this.nDays = nDays;
		sc = new Scanner(System.in);
		//배열 생성
		days= new Day[nDays];
		
		for(int i = 0;i< days.length; i++) {
			days[i] = new Day();//객체 생성
			
		}
	}
	//input 메소드 생성
	public void input() {
		
		System.out.print("날짜(1~30) : ");
		int dayNum = sc.nextInt();
		
		
		System.out.print("할일(빈칸없이입력) : ");
		String work = sc.next();
		dayNum--;
		
		if (dayNum < 0 || dayNum > nDays) {
			System.out.println("날짜의 범위를 벗어났습니다");
			return ;
		}
		
		days[dayNum].set(work);
		
	}
	//view메소드생성
	public void view() {
		System.out.print("날짜(1~30) : ");
		int dayNum = sc.nextInt();
		dayNum--;
		
		if (dayNum < 0 || dayNum > nDays) {
			System.out.println("날짜의 범위를 벗어났습니다");
			return ;
		}
		System.out.print((dayNum+1)+"일의 할일은 ");
		days[dayNum].show();
	}
	//finish메소드 생성
	public void finish() {
		System.out.println("프로그램을 종료합니다");
		System.exit(0);
		
	}
	//run
	public void run() {
		System.out.println("이번 달 스케줄 관리 프로그램");
		
		while(true) {
			System.out.print("할일 (입력 : 1, 보기 : 2, 끝내기 : 3) >> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break;
				default:
					System.out.println("잘못 입력 하셨습니다.");
			}
	
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		new MonthSchedule(30).run();
				
		
		
	}

}
