package pcroom;

/*속성 (변수)

String name (회원 이름)

int remainingTime (남은 시간, 분 단위)

생성자

Member(String name, int remainingTime): 이름과 남은 시간을 받아서 저장합니다.

메서드

public void addTime(int minutes): 전달받은 minutes만큼 remainingTime에 더해줍니다.

public void printInfo(): "회원명: [name], 남은시간: [remainingTime]분" 형태로 출력합니다.*/

public class Member {
	
	// 문자열 이름
	String name;
    // 정수형 남은시간
	int remainingTime;

	// 생성자
	public Member(String name, int remainingTime) {
		this.name = name;
		this.remainingTime = remainingTime;
	}
    // 매서드    
	           // 추가시간
	public void addTime(int minutes) {
      remainingTime +=minutes;
}               
	            // 좌석현황
	public void printInfo() {
		System.out.println("회원명: "+name+", 남은시간: "+remainingTime+"분 형태로 출력합니다.");
	}
		
	}
