package com.exam;

import java.util.Scanner;

public class Concert {

    Group s = new Group('S');
    Group a = new Group('A');
    Group b = new Group('B');

    public static void main(String[] args) {
        System.out.println("글로벌 인 콘서트 예약프로그램");
        Concert c = new Concert();
        c.run();
    }

    void reserve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석구분 S(1), A(2), B(3) => ");
        int inp = sc.nextInt();

        if (inp == 1) {
            s.viewSeats();
            s.reserve();
            System.out.println();
        } else if (inp == 2) {
            a.viewSeats();
            a.reserve();
            System.out.println();
        } else if (inp == 3) {
            b.viewSeats();
            b.reserve();
            System.out.println();
        } else {
            System.out.println("등급에 맞는 숫자를 입력해주세요");
            System.out.println();
        }
    }

    void search() {
        s.viewSeats();
        a.viewSeats();
        b.viewSeats();
        System.out.println(">>>>>>>>>>  조회를 완료 하였습니다.    <<<<<<<<<<<<");
        System.out.println();
    }

    void cancel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석 S:1,  A:2,   B:3  >> ");
        int inp = sc.nextInt();

        if (inp == 1) {
            s.viewSeats();
            s.cancel();
        } else if (inp == 2) {
            a.viewSeats();
            a.cancel();
        } else if (inp == 3) {
            b.viewSeats();
            b.cancel();
        } else {
            System.out.println("등급에 맞는 숫자를 입력해주세요");
        }
    }

    void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 종료:4  => ");
            int inp = sc.nextInt();
            if (inp == 1) {
                reserve();
            } else if (inp == 2) {
                search();
            } else if (inp == 3) {
                cancel();
            } else if (inp == 4) {
                finish();
                break;
            } else {
                System.out.println("오류입니다. 다시 입력해주세요");
            }
        }
    }
}

class Group {
    char grade;
    Seat[] seat;

    Group(char grade) {
        this.grade = grade;
        this.seat = new Seat[10];
        for (int i = 0; i < seat.length; i++) {
            seat[i] = new Seat();
        }
    }

    void reserve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("번호 : ");
        int idx = sc.nextInt();

        if (idx < 1 || idx > 10) {
            System.out.println("잘못된 좌석번호입니다. 다시 입력하세요");
            return;
        }
        if (seat[idx - 1].isOccupied()) {
            System.out.println("이미 예약된 좌석입니다.");
            return;
        }

        seat[idx - 1].reserve(name);
    }

    void cancel() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();

        for (int i = 0; i < seat.length; i++) {
            if (seat[i].match(name)) {
                seat[i].cancel();
                return;
            }
        }
        System.out.println("없는 예약자명입니다. 다시 입력하세요.");
    }

    void viewSeats() {
        System.out.print(grade + " : ");
        for (int i = 0; i < seat.length; i++) {
            System.out.print(seat[i].name + " ");
        }
        System.out.println();
    }
}

class Seat {
    String name;

    Seat() {
        this.name = "---";
    }

    void reserve(String name) {
        this.name = name;
    }

    void cancel() {
        this.name = "---";
    }

    boolean isOccupied() {
        return !this.name.equals("---");
    }

    boolean match(String name) {
        return this.name.equals(name);
    }
}