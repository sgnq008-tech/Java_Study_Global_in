
public class OperEX07 {

	public static void main(String[] args) {

        char c1 = 'a';
        char c2 = (char)(c1+1); // 왼쪽의 작은 수가 오른쪽에 큰 수로 옮기는게 가능하지만 반대의 경우는 작은 수가 큰 수를 다 받아들일 수 없어 에러가 난다.
        char c3 = 'a'+1;
        
        int i = c1 + 1; // 97 + 1 = 98
        
        c3 = (char)(c1 + 1);
        c2++;
        c2++;
        
        System.out.println(i);
        System.out.println(c2);
        System.out.println(c3);

;

        
	}

}
