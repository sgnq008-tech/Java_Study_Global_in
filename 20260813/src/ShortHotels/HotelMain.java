package ShortHotels;

import java.util.Scanner;

public class HotelMain {

    public static void main(String[] args) {
        // 2층, 층당 2개 방을 관리하는 호텔 매니저 생성
        HotelManager manager = new HotelManager(2, 2);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== 스마트 호텔 현재 투숙 현황 ===");
            
            // 객실 출력
            manager.printAllRooms();

            // 만실 체크
            if (manager.isFull()) {
                System.out.println("오늘 방이 다 차서 예약을 안 받습니다!");
                break;
            }

            System.out.println("\n1. 입실 수속 | 2. 퇴실 수속 | 0. 시스템 종료");
            String menu = sc.next();

            if (menu.equals("1")) {
                System.out.println("입실할 방 번호:");
                int target = sc.nextInt();
                System.out.println("고객 이름:");
                String name = sc.next();

                manager.processCheckIn(target, name); // 입실 처리는 매니저가!

            } else if (menu.equals("2")) {
                System.out.println("퇴실할 방 번호는: ");
                int target = sc.nextInt();

                manager.processCheckOut(target); // 퇴실 처리는 매니저가!

            } else if (menu.equals("0")) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }
        }

        sc.close();
    }
}