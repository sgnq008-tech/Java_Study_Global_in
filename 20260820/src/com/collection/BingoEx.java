package com.collection;
import java.util.*;
public class BingoEx {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		int[][] board = new int[5][5];
		
		for(int i =0; set.size() < 25; i++) {
			set.add((int)(Math.random()*50)+1+"");
			// +1을 하는 이유는 0이라는 숫자가 안나오게 하기 위해서
		}
		Iterator it = set.iterator();
		
		for(int i =0; i < board.length; i++) {
			for(int j = 0; j <board[i].length;j++) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? " " :" ")+board[i][j]);
			}
			System.out.println();
		}

	}

}
