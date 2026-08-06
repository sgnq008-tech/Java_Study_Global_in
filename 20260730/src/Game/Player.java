package Game;

import java.util.Scanner;

public class Player {
	private Player[] players ;
	private String name; 
	private Scanner sc;
	
	public Player getName() {
		return name;
	}
	
	public boolean checkSuccess(String lastWord) {
		
		int lastIndex = lastWord.length() -1; 
		
		
		// 마지막 단어의 맨 마지막 문자와
		// 다음 참가자 
		if(lastWord.charAt(lastIndex) == word.charAt(0)) {
			return true;
		}else
			return false;
	}
	
	
}

public boolean 