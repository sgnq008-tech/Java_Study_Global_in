package cafe;

public class Order {
	
	String menuName; //(메뉴 이름)
	int price; //(메뉴 단가)
	int count; //(주문 수량)
	
	public Order(String menuName, int price, int count) {
		this.menuName = menuName;
		this.price = price;
		this.count = count;
	}
	
	public int getTotalPrice() {
		price *=count;
		 return price * count;
	}
	
	public void addCount(int add) {
		count += add;
		System.out.println("수량이 ["+add+"]개 추가되어 총 ["+count+"]개가 되었습니다.");
	}
	
	public void printOrderInfo() {
		getTotalPrice(); 
		System.out.println("["+menuName+"] ["+count+"]잔 - 총 결제금액: [총금액]원");
		
	}
	

}
