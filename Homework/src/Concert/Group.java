package Concert;

import java.util.Scanner;

// 특정 구역(S석, A석, B석)의 좌석 10개를 묶어서 관리하는 클래스
public class Group {
    private String type;   // 구역 이름 (예: "S", "A", "B")
    private Seat[] seats;  // Seat 객체 10개를 담는 배열

    // 생성자: 구역 이름과 개수를 받아 배열을 만들고 Seat 객체로 채움
    public Group(String type, int count) {
        this.type = type;
        this.seats = new Seat[count]; // 배열 공간 생성
        for (int i = 0; i < seats.length; i++) {
            seats[i] = new Seat();    // 각 칸에 실제 Seat 객체 생성
        }
    }

    // 현재 구역의 좌석 상태와 아래쪽에 좌석 번호(1~10)를 함께 출력
    public void printSeats() {
        // 1번째 줄: 등급 이름 및 상태(예약자 이름 또는 ---) 출력
        System.out.print(type + " : ");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i].isOccupied()) {
                System.out.print(seats[i].getName() + " "); // 예약된 자리면 이름 출력
            } else {
                System.out.print("--- ");                    // 빈 자리면 "---" 출력
            }
        }
        System.out.println(); // 줄바꿈

        // 2번째 줄: 좌석 번호(1~10) 정렬하여 출력
        System.out.print("    "); // "S : " 길이 맞춤용 공백
        for (int i = 1; i <= seats.length; i++) {
            System.out.printf("%-4d", i); // 4칸 간격 정렬
        }
        System.out.println(); // 줄바꿈
    }

    // 구역 내 좌석 예약 기능 (잘못 입력 시 재입력 유도)
    public boolean reserve(Scanner sc) {
        printSeats(); // 현재 좌석 상태 출력
        
        System.out.print("이름 : ");
        String name = sc.next(); // 예약자 이름 입력
        
        int seatNum;
        
        // 올바른 번호와 빈 좌석을 입력할 때까지 반복
        while (true) {
            System.out.print("번호 : ");
            seatNum = sc.nextInt(); // 번호 입력

            // 1) 좌석 번호가 1~10 범위를 벗어난 경우
            if (seatNum < 1 || seatNum > seats.length) {
                System.out.println("잘못된 좌석 번호입니다. 다시 골라주세요.");
                continue; // 다시 번호 입력으로 이동
            }

            // 2) 이미 예약된 좌석인 경우
            if (seats[seatNum - 1].isOccupied()) {
                System.out.println("이미 예약된 좌석입니다. 다시 골라주세요.");
                continue; // 다시 번호 입력으로 이동
            }

            // 정상적인 좌석인 경우 반복문 탈출
            break; 
        }

        // 해당 위치의 Seat 객체에 예약 처리
        seats[seatNum - 1].reserve(name);
        return true;
    }

    // 구역 내 좌석 취소 기능 ("취소되었습니다" 알림 메시지 추가)
    public boolean cancel(Scanner sc) {
        printSeats(); // 현재 좌석 상태 출력
        
        System.out.print("이름 : ");
        String name = sc.next(); // 취소할 예약자 이름 입력

        // 0번부터 9번 좌석까지 탐색하며 이름이 맞는지 검사
        for (int i = 0; i < seats.length; i++) {
            if (seats[i].match(name)) { // 이름이 일치하면
                seats[i].cancel();      // 해당 좌석 취소 처리
                System.out.println(name + "님의 예약이 취소되었습니다."); // 📌 취소 성공 안내 문구
                return true;
            }
        }

        // 10개 좌석을 다 찾아도 동일한 이름이 없는 경우
        System.out.println("해당 이름의 예약자를 찾을 수 없습니다. 취소에 실패했습니다.");
        return false;
    }
}