package Machine;

import java.util.*;

public class RepairshopMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Car에 담은 자동차명
		String[] model = { "아반떼", "포르쉐", "BMW" };
		// Car에 담은 고장 원인명
		String[] issue = { "엔진오일 교체", "브레이크 패드 교체", "타이어 교체" };

		Car myCar[] = new Car[3];
		
       // Car myCar[3]에 객체 생성
		for (int i = 0; i < myCar.length; i++) {
			myCar[i] = new Car(model[i], issue[i]);
		}

			while (true) {
				int remaining = 0;
				// 전체 차량 상태 출력 및 미수리 차량 수
				System.out.println("\n=== 오늘 입고된 차량 목록 ===");
				
				for (int i = 0; i < myCar.length; i++) {
					myCar[i].printInfo();
					if (myCar[i].isFixed == false) {
						remaining++;
					}
				}
                //퇴근 조건: 남은 차량이 0대이면 칼퇴근 후 무한 루프 탈출
					if (remaining == 0) {
						System.out.println("모든 차량의 정비가 완료되었습니다. 칼퇴근합니다!");
						break;
					}
					
					// 메뉴 선택
		            System.out.println("----------------------------------------");
		            System.out.println("1. 차량 정비하기 | 0. 작업 중단 및 강제 퇴근");
		            System.out.print("선택: ");
		            String input = sc.nextLine();
		            
		         // 수리할 차 이름 입력받기
		            if (input.equals("1")) {
		                System.out.print("정비할 차종을 입력하세요: ");
		                String targetModel = sc.nextLine();
		                
		             // 입력한 차를 배열에서 찾았는지 기록하는 스위치 변수
		                boolean isFound = false;

		                for (int i = 0; i < myCar.length; i++) {
		                    // 입력한 차종과 목록의 차종이 일치하는지 비교
		                    if (myCar[i].model.equals(targetModel)) {
		                        isFound = true; // 차를 찾았으므로 true로 변경

		                        if (myCar[i].isFixed) {
		                            System.out.println(">>> 이미 정비가 완료된 차량입니다.");
		                        } else {
		                            myCar[i].fix(); // 수리 완료 처리 (isFixed = true)
		                        }
		                        break; // 차를 찾았으므로 for문 탈출
		                    }
		                }
		             
		                // for문을 다 돌았는데도 isFound가 여전히 false 라면 (입고되지 않은 차)
		                if (!isFound) {
		                    System.out.println(">>> 해당 차량이 입고되어 있지 않습니다.");
		                }
                                       // 문자열 비교
		            } else if (input.equals("0")) {
		                System.out.println("작업을 중단하고 강제 퇴근합니다.");
		                break; // while문 탈출
		            } else {
		                System.out.println("잘못된 입력입니다. 다시 선택해 주세요.");
		            }
		        }

				
			}

		

	}

