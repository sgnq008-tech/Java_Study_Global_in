package VendingMachine;

public class Drink {
	// 필드
	String name; // 음료이름
	int price;  // 음료 가격

	// 생성자
	public Drink(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메서드
	
	// 출력
	public void printInfo() {
		System.out.println("["+name+ '-' +price+"]");
	}

}
