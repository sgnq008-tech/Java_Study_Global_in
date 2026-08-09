package PhoneBookPhone;
/*
 * 
 * 문]
 * 		이름(name), 전화번호(tel) 필드와 생성자를 가진 Phone클래스를 작성하고,
 * 		실행 클래스인 PhoneBook클래스를 작성하시오.
 * 
 * 		결과
 * 		인원수 : 3
 * 		이름과 전화번호(이름과 전화번호는 빈간없이 입력): 가길동 1111-1111
 * 		이름과 전화번호(이름과 전화번호는 빈간없이 입력): 나길동 1111-1111
 * 		이름과 전화번호(이름과 전화번호는 빈간없이 입력): 다길동 1111-1111
 * 		저장되었습니다...
 * 		
 * 		검색할 이름 : 홍길동 
 * 		홍길동이 없습니다. 
 * 
 * 		검색할 이름 : 가길동
 * 		가길동의 전화번호는 1111-1111입니다.
 * 		검색할 이름 : 그만 
 * 		프로그램을 종료합니다.
 * 
 * 
 * 		PhoneBook 클래스에서 저장할 사람의 수를 입력받고 Phone 객체배열을 생성함 
 * 		한 사람의 정보는 하나의 Phone 객체에 저장한다.
 * 		문자열이 같은지 비교할때는 equals() 메소드를 활용함 
 * 	
 */


import java.util.Scanner;

public class PhoneBook {
	private Scanner sc;
	private Phone[] phone;
	
	//생성자
	public PhoneBook() {
		sc = new Scanner(System.in);
		
	}
	
	
	public void read() {
		//입력 및 저장
		System.out.print("인원 수 : ");
		int n = sc.nextInt();
		//인원수만큼 객체배열 선언
		phone = new Phone[n];
		
		//입력받은 인원수 만큼 이름과 전화번호를 입력받아 저장 
		for(int i =0; i<phone.length; i++) {
			System.out.print("이름과 전화번호(이름과 전화번호는 빈칸없이 입력) : ");
			String name = sc.next();
			String tel = sc.next();
			
			phone[i] = new Phone(name, tel); // phone 클래스에 저장
			
		}
		
		System.out.println("저장되었습니다...");

	}
	
	public String search(String name) {
		//이름으로 검색
		for(int i = 0; i< phone.length; i++) {
			if(phone[i].getName().equals(name)) {
				return phone[i].getTel();
			}
			
		}
		return null;
		
	}
	
	public void run() {
		read();
		while(true) {
			System.out.print("검색할 이름 : ");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			String tel = search(name);
			if(tel == null) {
				System.out.println(name+"이 없습니다.");
			}else {
				System.out.println(name+"의 전화번호는 "+tel+"입니다.");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new PhoneBook().run();
		
	}
	
	
}
