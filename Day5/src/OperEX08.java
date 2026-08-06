
public class OperEX08 {

	public static void main(String[] args) {
      char c = 'a';
      for(int i = 0; i < 26; i++) {
    	  System.out.print(c++);
      }
      System.out.println();
      c = 'A';
      for(int i = 0; i < 26; i++) {
    	  System.out.print(c++);
      }
      
      c='0';
      for(int i = 0; i < 10; i++) {
    	  System.out.print(c++);
	}
      
      char lower = 'a';
      char upper = (char) (lower-32);
      System.out.println(upper);
      
      float pi = 3.141592f;
      float shortPi = (int)(pi * 1000) /1000f;
      System.out.println(shortPi);
      
      double ppi = 3.141592;
     double shortPPi = (int)(pi * 1000+0.5) /1000.0;
      System.out.println(shortPPi);
      
      double di = 3.141592;
      double ddi = Math.round(di * 1000) / 1000.0;
      System.out.println(ddi);

      
      
}

}
