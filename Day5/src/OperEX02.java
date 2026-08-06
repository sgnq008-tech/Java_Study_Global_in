
public class OperEX02 {
	
	public static void main(String[] args) {
		// ++i : 전위형, i++: 후위형
		// 다낭연산자
		
		int i = 5, j= 0;
		j = i++;
		System.out.println("j=i++ 실행후 i="+i+", j ="+j);
		
		i=5;// i와 j를 5와 0으로 변경
		j = 0;
		j = ++i;
		System.out.println("j=++i 실행후 i="+i+", j ="+j);

		
	}

}
