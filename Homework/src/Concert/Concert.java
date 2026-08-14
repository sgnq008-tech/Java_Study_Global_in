package Concert;

import java.util.Scanner;

// 콘서트 전체 시스템 관리 및 메뉴 입출력을 담당하는 클래스
public class Concert {
    private String concertName; // 콘서트 이름
    private Group[] groups;     // S, A, B구역을 담는 Group 객체 배열
    private Scanner sc;

    // 생성자: 콘서트 이름 등록 및 S, A, B구역 객체 각각 10석씩 생성
    public Concert(String concertName) {
        this.concertName = concertName;
        this.sc = new Scanner(System.in);
        
        this.groups = new Group[3];
        groups[0] = new Group("S", 10); // 0번 : S석
        groups[1] = new Group("A", 10); // 1번 : A석
        groups[2] = new Group("B", 10); // 2번 : B석
    }

    // 프로그램 동작 메인 루프
    public void run() {
        System.out.println(concertName + " 예약프로그램");

        // 사용자가 종료(4)를 선택할 때까지 무한 반복
        while (true) {
            System.out.print("\n예약:1, 조회:2, 취소:3, 종료:4  => ");
            
            // 숫자가 아닌 문자 입력 시 예외 처리
            if (!sc.hasNextInt()) {
                System.out.println("숫자로 입력해 주세요. 다시 골라주세요.");
                sc.next(); // 입력 버퍼 비우기
                continue;
            }

            int menu = sc.nextInt();

            // 입력한 메뉴에 맞춰 기능 호출
            switch (menu) {
                case 1: reserve(); break; // 1번 : 예약
                case 2: search(); break;  // 2번 : 조회
                case 3: cancel(); break;  // 3번 : 취소
                case 4: finish(); return; // 4번 : 종료 (run 메서드 완전 탈출)
                default: System.out.println("잘못된 메뉴 번호입니다. 다시 골라주세요.");
            }
        }
    }

    // [예약 기능] 좌석 구역 선택 후 해당 Group의 reserve 호출
    private void reserve() {
        int typeNum;
        
        // 1~3번 좌석구분을 올바르게 고를 때까지 반복
        while (true) {
            System.out.print("좌석구분 S(1), A(2), B(3) => ");
            typeNum = sc.nextInt();

            if (typeNum >= 1 && typeNum <= 3) {
                break; // 올바른 메뉴 입력 시 반복 탈출
            }
            System.out.println("잘못된 좌석구분 번호입니다. 다시 골라주세요.");
        }

        // 선택한 구역 객체(groups[0~2])의 reserve 메서드 실행
        groups[typeNum - 1].reserve(sc);
    }

    // [조회 기능] S, A, B 구역 전체의 좌석 현황 출력
    private void search() {
        for (int i = 0; i < groups.length; i++) {
            groups[i].printSeats(); // 각 구역 상태 출력
        }
        System.out.println("\n>>>>>>>>>>  조회를 완료 하였습니다.    <<<<<<<<<<<<");
    }

    // [취소 기능] 좌석 구역 선택 후 해당 Group의 cancel 호출
    private void cancel() {
        int typeNum;
        
        // 1~3번 좌석구분을 올바르게 고를 때까지 반복
        while (true) {
            System.out.print("좌석 S:1,  A:2,   B:3  >> ");
            typeNum = sc.nextInt();

            if (typeNum >= 1 && typeNum <= 3) {
                break; // 올바른 메뉴 입력 시 반복 탈출
            }
            System.out.println("잘못된 좌석구분 번호입니다. 다시 골라주세요.");
        }

        // 선택한 구역 객체(groups[0~2])의 cancel 메서드 실행
        groups[typeNum - 1].cancel(sc);
    }

    // [종료 기능]
    private void finish() {
        System.out.println("프로그램을 종료합니다.");
        sc.close(); // Scanner 자원 해제
    }
}