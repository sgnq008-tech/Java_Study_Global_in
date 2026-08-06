package SwitchEX;
/*랜덤으로 숫자를 얻기위해 Math.random()메소드를 사용한다.
이 메소드는 0.0 ~ 1.0 사이에 속하는 하나의 double형 실수값을 반환함 
그런데 0.0은 포함하고, 1.0은 포함하지 않는다.

* 0.0 <= Math.random() < 1.0
* 
* 만약 1 ~ 3 사이에 정수를 구하려면
* 3단계를 거쳐서 정수값을 얻게 된다.
* 
* 1. 각 변에 3을 곱함
*     0.0 * 3 <= Math.random() *3 < 1.0 * 3
* => 0.0    <= Math.random() * 3 < 3.0
* 
* 2. 각 변을 정수형으로 변환한다.
*   (int)0.0 * 3 <= (int)(Math.random() *3) < (int)(1.0 * 3)
* => 0  <= (int)(Math.random() * 3) < 3.0
* 
* 3. 각 변에 1을 더한다.
*   0 + 1 <= (int)(Math.random() *3) + 1 < 3 + 1
* => 1  <= (int)(Math.random() * 3) + 1 < 4
* 
*  위의 과정을 거치면서 1과 3사이의 정수 중 하나를 얻을 수 있다.
*  1은 포함하고, 4는 포함하지 않는다. 
*  
*  사용자가 입력한 값을 (user)라고 하고, 컴퓨터가 생성한 수를 (com)
*  
*  user  \  com         1(가위)         2(바위)          3(보)
*    
*    1                         무승부             컴승            유저승
*    2                         유저승            무승부            컴승
*    3                          컴승             유저승           무승부 
*    
*    무승부: 0   컴승: -1, 2    유저승: 1, -2
* 
*/

import java.util.*;

public class SwitchEX04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위 바위 보 :");
		int user = sc.nextInt();// 1, 2, 3
		int com = (int) (Math.random() * 3) + 1;

		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴퓨터는" + com + "입니다.");

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("컴퓨터가 이겼습니다.");
			break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("무승부입니다.");
			break;

		// default는 넣든 안넣든 실행가능
		default:
			System.out.println("유효 범위가 아닙니다.");
			break;
		}

	}

}
