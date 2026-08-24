package com.collection;

import java.util.*;

public class QueueEx02 {

	// 최근 입력된 명령어를 저장할 Queue 객체 생성 (실제 구현체는 LinkedList 사용)
	static Queue q = new LinkedList();
	
	// 최근 히스토리를 최대 5개까지만 유지하기 위한 상수 설정
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {

		// 사용자가 'q'를 입력해 종료할 때까지 계속 입력을 받는 무한 루프
		while (true) {
			System.out.print(">>"); // 프롬프트 출력
			
			try {
				// 키보드 입력을 받기 위해 Scanner 객체 생성 및 공백 제거(trim)
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();

				// 1. 아무것도 입력하지 않고 엔터만 쳤을 경우 다시 입력받음
				if ("".equals(input))
					continue;

				// 2. 'q' 또는 'Q' 입력 시 프로그램 종료
				if (input.equalsIgnoreCase("q")) {
					System.exit(0);
				} 
				// 3. 'help' 입력 시 사용 가능한 명령어 목록 출력
				else if (input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여 줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개만 보여줍니다.");
				} 
				// 4. 'history' 입력 시 최근 기록된 명령어 목록(최대 5개) 출력
				else if (input.equalsIgnoreCase("history")) {
					int i = 0;
					
					// 'history'라는 명령어 자체도 히스토리에 저장
					save(input);

					// Queue 인터페이스에는 반복자(listIterator)가 없으므로, 
					// 실제 구현체인 LinkedList 타입으로 다운캐스팅(형변환)하여 순회 기능을 사용함
					LinkedList tmp = (LinkedList) q;
					ListIterator it = tmp.listIterator();
					
					// 큐 안의 히스토리를 번호(1, 2, 3...)와 함께 순서대로 출력
					while (it.hasNext()) {
						System.out.println(++i + "." + it.next());
					}
				} 
				// 5. 그 외 일반 명령어가 입력된 경우
				else {
					save(input); // 히스토리에 저장
					System.out.println(input); // 입력받은 명령어 그대로 출력
				}

			} catch (Exception e) {
				System.out.println("입력 오류 입니다.");
			}
		} // end while

	} // end main()

	// 입력된 명령어를 큐에 저장하고 최대 개수(5개)를 관리하는 메서드
	public static void save(String input) {
		// 빈 문자열이 아니면 큐의 맨 뒤에 명령어 추가
		if (!"".equals(input)) {
			q.offer(input);
		}
		
		// 큐의 크기가 5개를 초과하면, 가장 오래전에 들어온 첫 번째 명령어를 삭제(FIFO)
		if (q.size() > MAX_SIZE) {
			q.remove();
		}
	}

}