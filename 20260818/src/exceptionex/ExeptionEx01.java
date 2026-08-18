package exceptionex;
/*예외처리
 * 1.프로그램 오류
 * - 프로그램이 실행중 어떤 원인에 의해서 오동작을 하거나 비정상적으로
 * 종료되는 경우를 오류라고함
 * 컴파일 에러: 컴파일 시 발생하는 에러
 * 런타임 에러: 실행 도중에 발생하는 에러
 * 컴파일러는 문법적인 오류만 인식 할 수 있다.
 * 자바에서는 런타임 에러를 에러와 예외로 구분함
 * ->예외: 프로그램 코드에 의해서 수습될 수 있는 미약한 오류
 * -> 오류: 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
 * 
 * 2. 예외가 일어난느 상황
 * - 정수를 0으로 나누는 경우
 * - 배열의 index값이 음수값을 가지거나, 크기를 벗어나는 경우
 * -부적절한 형변환 
 * - 입출력시 interrupt가 나타나는 경우
 * - 입력 출력 하기 위한 파일이 존재하지 않는경우
 * - 메소드 호출시 
 * 
 * 3. 예외 처리 목적
 * -예외의 발생으로 인한 실행중인 프로그램의 갑작스런 비정상 종료를 막고,
 *  정상적인 실행 상태를 유지할 수 있도록 하는 것
 *  
 *  4. 예외처리 구문(try~catch
 *   try{
 *   예외가 발생할 가능성이 있는 코드 작성 
 *   }catch(예외타입1 매개변수1){
 *   	예외발생시 처리할 코드 작성 
 *   }
 *   }catch(예외타입1 매개변수1){
 *   	예외발생시 처리할 코드 작성 
 *   }
 *   }catch(예외타입1 매개변수1){
 *   	예외발생시 처리할 코드 작성 
 *   }finally{
 *     예외와 상관없이 실행할 코드
 *   }
 * 
 */
public class ExeptionEx01 {
	public static void main(String[] args) {
		int number = 50;
		int result = 0;
		for(int i = 0; i<10; i++)
		try{
			result=number/(int)(Math.random()*5);
			System.out.println(result);
		}catch(ArithmeticException ae) {
			System.out.println("Exception 발생!");
		}
		
	}
}
