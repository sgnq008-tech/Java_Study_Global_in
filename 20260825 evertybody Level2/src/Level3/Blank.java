package Level3;

public class Blank {
	public static void main(String[] args) {
        int n = 13; // 2진수: 1101 (3번째 비트가 1)
        int mask = 1 << 3; // 8 (2진수: 1000)

      
        // n과 mask를 비트 연산하여 0이 아니면 true, 0이면 false
        boolean isBitSet = ((n & mask) != 0) ? true : false;
        		
        System.out.println("3번째 비트 활성화 여부: " + isBitSet); // true
    }
}