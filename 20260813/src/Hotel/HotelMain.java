package Hotel;

import java.util.*;

public class HotelMain {

	public static void main(String[] args) {

		// 1. 2층, 층당 2개 객실 생성 (101호, 102호 / 201호, 202호)
		Room[][] rooms = new Room[2][2];

		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				rooms[i][j] = new Room((i + 1) * 100 + (j + 1));
			}
		}

		Scanner sc = new Scanner(System.in);

		// 2. Hotel 운영 시스템 (무한 루프)
		while (true) {
			System.out.println("\n=== 스마트 호텔 현재 투숙 현황 ===");
			int emptyRooms = 0;

			// [객실 현황 출력 및 빈 방 카운트]
			for (int i = 0; i < rooms.length; i++) {
				for (int j = 0; j < rooms[i].length; j++) {
					rooms[i][j].printInfo();

					if (rooms[i][j].isOccupied == false) {
						emptyRooms++;
					}
				}
			}

			// [만실 체크] - 2중 for문이 완전히 끝난 직후 검사
			if (emptyRooms == 0) {
				System.out.println("오늘 방이 다 차서 예약을 안 받습니다!");
				break;
			}

			// [메뉴 입력]
			System.out.println("\n1. 입실 수속 | 2. 퇴실 수속 | 0. 시스템 종료");
			String menu = sc.next();

			// ----------------------------------------------------
			// [메뉴 1: 입실 수속]
			// ----------------------------------------------------
			if (menu.equals("1")) {
				System.out.println("입실할 방 번호:");
				int targetroom = sc.nextInt();

				System.out.println("고객 이름:");
				String human = sc.next();

				boolean found = false;

				outer:
				for (int i = 0; i < rooms.length; i++) {
					for (int j = 0; j < rooms[i].length; j++) {

						if (rooms[i][j].roomNumber == targetroom) {
							found = true;

							if (rooms[i][j].isOccupied == true) {
								System.out.println("이미 예약된 방입니다.");
							} else {
								rooms[i][j].checkIn(human);
							}
							break outer; // 방을 찾았으니 2중 for문 전체 탈출
						}
					}
				}

				if (found == false) {
					System.out.println("존재하지 않는 방 번호입니다.");
				}
			} 
			// ----------------------------------------------------
			// [메뉴 2: 퇴실 수속]
			// ----------------------------------------------------
			else if (menu.equals("2")) {
				System.out.println("퇴실할 방 번호는: ");
				int targetroom1 = sc.nextInt();

				boolean founds = false;

				outer:
				for (int i = 0; i < rooms.length; i++) {
					for (int j = 0; j < rooms[i].length; j++) { // rooms[i].length 로 수정

						// 세미콜론(;) 제거 및 조건 블록 연결
						if (rooms[i][j].roomNumber == targetroom1) {
							founds = true;

							if (rooms[i][j].isOccupied == false) {
								System.out.println("현재 빈 방입니다. 퇴실할 손님이 없습니다.");
							} else {
								rooms[i][j].checkout();
							}
							break outer; // 방을 찾았으니 2중 for문 전체 탈출
						}
					}
				}

				// 변수명 founds로 맞춰서 메뉴 2 내부에서 결과 판단
				if (founds == false) {
					System.out.println("존재하지 않는 방입니다.");
				}
			} 
			// ----------------------------------------------------
			// [메뉴 0: 시스템 종료]
			// ----------------------------------------------------
			else if (menu.equals("0")) {
				System.out.println("시스템을 종료합니다.");
				break;
			} 
			// ----------------------------------------------------
			// [잘못된 번호 입력]
			// ----------------------------------------------------
			else {
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}

		} // while 문 끝

		sc.close();
	}
}