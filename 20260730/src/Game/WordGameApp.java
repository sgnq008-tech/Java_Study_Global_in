package Game;

import java.util.Scanner;

public class WordGameApp {
	private Player[] players ;
	private String startword = "아버지"; // 게임 시작 단어
	private Scanner sc;
	
	// 생성자
	public WordGameApp() {
		sc = new Scanner(System.in); 
	}
	
	// 게임참가자가 수를 입력받고, Player 객체배열을 생성하는 메소드
	public void createPlayers() {
		System.out.println("게임 참가자 인원 수 : ");
		int n =sc.nextInt();
		players = new Player[n]; // 객체 배열 생성
		
		// 참가자의 이름과 객체 생성
		for(int i = 0; i < n; i++) {
			System.out.println("이름 입력 : ");
			String name = sc.next();
			players[i] = new Player(name);
		}
	}

	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다. ..........");
		createPlayers(); // 참가자 수와 이름을 입력 받는다.
		String lastWord = startword;
		System.out.println("시작 단어는 "+lastWord+"입니다.");
		
		int num = 0;
		while(true) {
			// 다음 참가자 입력한 단어
			String newWord = players[num].getWordFromUser();
			
			if(!players[num].checkSuccess(lastWord)) {
				// 참가자가 성공하지 못했을 경우
				System.out.println(players[num].getName()+"이 게임에서 졌습니다.");
				break;
			}
			num++;
			num %= players.length;
			lastWord= newWord;
		}
		
 	}
	public static void main(String[] args) {
		
	}


}
