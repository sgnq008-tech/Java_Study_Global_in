package com.ArrayEX;
/*문]
 *    배열을 활용하여 세과목에 점수를 입력받아
 *    총점과 평균을 구하는 프로그램을 구현하시오.
 */

import java.io.*;
public class ArrayEXAM01 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		
		// 과목명을 배열에 저장
		String[] subname = {"국어","영어","수학"};
		//                                 0        1       2
		
		int [] sub = new int[subname.length +1];
		// int [] sub = new int[4]; 방법도 가능
		//           sub[0] : 국어점수, sub[1] : 영어점수, sub[2] : 수학점수, sub[3] : 합계총점
		float avg = 0.0f;
		
		for(int i =0; i < sub.length-1; i++) { // 총점수를 입력받기 위해 sub[3]은 필요없기 때문에 -1를 해주었다
			do {
				System.out.print(subname[i]+"점수 :");
				sub[i] = Integer.parseInt(br.readLine());
			}while(sub[i] <0 || sub[i] > 100); 
			// 각 과목점수를 0 ~ 100까지로 한다.
			// 합계(총점을 구함)
			sub[sub.length-1] += sub[i];
		}                                      //( )안에 꺼를 최우선으로 먼저 계산 실행한다
		avg = sub[sub.length-1] / (float)(sub.length-1); // ( )를 쳐서  sub.length-1은 1를 안뺴도 되는 상태
		//avg = sub[sub.length-1] / (float)sub.length-1; // ( )를 안뺴서 sub.length-1도 같이 1를 빼버린다
		// 그리고 ( )를 안뺴서 sub.length-1도 같이 1를 빼버리면, 평균을 구할떄도, 국어,수학,영어를 포함해서 3으로 나누어야 되는데
		// ( )가 안되어있으면 총점까지 포함해서 4로 나누고, 평균에서 1까지 빼버리고, 출력이 된다. (요약 66 / 4 = 평균-1) 
		System.out.println("총점 :" +sub[sub.length-1]);
		System.out.printf("평균 : %.2f", avg);
		
		

	}

}
