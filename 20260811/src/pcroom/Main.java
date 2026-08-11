package pcroom;

public class Main {

	public static void main(String[] args) {
        PCRoom pc = new PCRoom();

        // 1. 회원 객체 생성
        Member m1 = new Member("김철수", 30);  // 30분 남음
        Member m2 = new Member("이영희", 100); // 100분 남음
        Member m3 = new Member("박민수", 0);   // 0분 남음

        System.out.println("=== 1. 시간 충전 테스트 ===");
        // 2,400원 충전 -> 120분 추가되어 총 150분이 되어야 함
        pc.charge(m1, 2400); 

        System.out.println("\n=== 2. 착석 테스트 ===");
        pc.sit(1, m1); // 1번 좌석 성공
        pc.sit(1, m2); // 1번 좌석 중복 착석 시도 (실패 메시지)
        pc.sit(3, m3); // 3번 좌석 성공
        pc.sit(5, m2); // 잘못된 번호 예외 처리

        System.out.println("\n=== 3. 전체 좌석 현황 ===");
        pc.printSeatStatus();
    }
}
