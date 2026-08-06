
public class WriteEX01 {

	public static void main(String[] args) {
	
        System.out.write(65);
        // System.out.write(23);
        // System.out.write(97);
        System.out.flush();// 버퍼에 있는 내용을 출력해라.
        System.out.println();
        
        byte[] by = {'J', 'A', 'V', 'A'};
        System.out.write(by, 0, 4);
	}

}
