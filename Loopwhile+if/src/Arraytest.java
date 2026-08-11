
public class Arraytest {

	public static void main(String[] args) {
		int[] scores = {50, 85, 90, 45, 70};
		int index = 0;
		int sum = 0;
		int passCount = 0; 

		while (index < scores.length) {
			sum += scores[index];
			 passCount++;
		}
		System.out.println("합격자들의 총점("+sum+")과 합격자 수("+passCount+")");
	}

}
