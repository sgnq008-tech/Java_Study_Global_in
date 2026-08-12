package Array;

/*[문제 3] 배열 (Level 3: 2차원 배열 회전 및 가공)목표: 
 * 2차원 배열의 행과 열 인덱스를 자유롭게 다루기
 * 
 * 요구사항:
2 x 3 크기의 2차원 배열 int[][] original = {{1, 2, 3}, {4, 5, 6}}; 이 있습니다.
이 배열의 행과 열을 뒤바꾼 3 x 2 크기의 배열 int[][] transposed를 2중 for문으로 새로 생성하고 출력하세요.

예상 출력:
1 4 
2 5 
3 6 
*/
public class Array2 {
    public static void main(String[] args) {
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        // 2x3 배열을 3x2 배열로 전치하기 위한 공간 생성
        int[][] transposed = new int[3][2];

        // 행과 열 인덱스를 교차하여 대입
        for (int i = 0; i < original.length; i++) { // i: 0 ~ 1
            for (int j = 0; j < original[i].length; j++) { // j: 0 ~ 2
                transposed[j][i] = original[i][j];
            }
        }

        // 전치된 배열 출력
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}