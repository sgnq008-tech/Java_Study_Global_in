package genericex;

public class GenericEx02 {

	public static void main(String[] args) {
		Box<Integer>bi;
		bi =createBox();
		bi.set(20);
		System.out.println(bi.get());
	}
	static Box createBox() {
		return new Box<>();
	}
}
