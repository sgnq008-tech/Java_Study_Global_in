package Concert;

// 실행을 담당하는 메인 클래스
public class ConcertApp {

    public static void main(String[] args) {
        // 콘서트 매니저 객체 생성
        Concert concert = new Concert("글로벌 인 콘서트");
        
        // 예약 프로그램 실행
        concert.run();
    }
}