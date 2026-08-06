import java.io.*;
public class InputEX03 {

	public static void main(String[] args) throws IOException{

        int num1;
        int num2;
        System.out.print("첫번쨰 숫자 :");
        num1 = System.in.read() - 48; 
        System.in.skip(2);
        //System.in.read(); // \r => 13
        //System.in.read(); \n => 10
        System.out.print("두번쨰 숫자 :");
        num2 = System.in.read() - 48;
        
        System.out.println(num1);
        System.out.println(num2);

	}

}
