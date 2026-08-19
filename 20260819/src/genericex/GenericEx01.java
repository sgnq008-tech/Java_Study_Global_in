package genericex;

public class GenericEx01 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Box<Integer>bi= new Box<>();
		bi.set(10);
		//bi.set(new Integer(20));
		
		Integer i = bi.get();
		System.out.println(i);
		
		Box<String> bs = new Box<>();
		bs.set("はんじふんすきだよ");
		String s = bs.get();
		System.out.println(s);
	}
}
