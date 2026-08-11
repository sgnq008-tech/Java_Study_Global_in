package pcroom;

/*PCRoom 클래스
속성 (변수)

Member[] seats (좌석 배열, 크기 3으로 고정)

int hourlyRate = 1200 (1시간당 요금 1,200원)

생성자

PCRoom(): 크기 3인 seats 배열을 생성합니다. (초기 상태는 모두 null)

메서드

public void sit(int seatNum, Member member):

seatNum은 1~3번 좌석을 뜻합니다. (배열 인덱스는 seatNum - 1)

입력한 좌석 번호가 1~3 범위를 벗어나면 "잘못된 좌석 번호입니다." 출력

해당 좌석이 이미 사람이 차 있으면(seats[seatNum - 1] != null) "[seatNum]번 좌석은 이미 사용 중입니다." 출력

빈 좌석이면 해당 방에 member를 착석시키고 "[member.name]님이 [seatNum]번 좌석에 앉았습니다." 출력

public void charge(Member member, int money):

충전할 금액(money)을 받아 추가되는 시간을 계산합니다.

시간 계산 공식: (money / hourlyRate) * 60 (분 단위)

member.addTime(충전시간)을 호출하여 시간을 더해주고, "[member.name]님 [충전시간]분 충전 완료! (결제금액: [money]원)" 출력

public void printSeatStatus():

1번부터 3번 좌석까지 상태를 출력합니다.

좌석이 비어있으면(null) "[좌석번호]번 좌석: 빈 자리"

사람이 있으면 "[좌석번호]번 좌석: [회원이름] ([남은시간]분 남음)"*/
public class PCRoom {
	
	Member[] seats = new Member[3] ;

	int hourlyRate = 1200;
	
	public PCRoom() {
		seats = new Member[3];
	}
	
	public void charge(Member m, int cost) {
		System.out.println(m+"님이"+cost+"분 충전 완료");
		
	}
	
	public void sit(int seat, Member m) {
		System.out.println(m+"님이"+seat+"좌석에 앉았습니다");
		
	}
	
	public void printSeatStatus() {
		System.out.println(seat+"좌석 :"+m+" "+(remainingTime));
		
	}
}
