package practice;

import java.util.*;
public class P2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int i, k;
		
		for(i = 1; i <= 9; i++) {
			for(k = 2; k <= 9; k++) {
				System.out.printf("%3d x %d = %2d", k, i, k*i);
			}
			System.out.println();
		}
	}

}
