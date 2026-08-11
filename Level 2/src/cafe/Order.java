package cafe;

public class Order {

	String menuName; // (메뉴 이름)
	int price; // (메뉴 단가)
	int count; // (주문 수량)

	public Order(String menuName, int price, int count) {
		this.menuName = menuName;
		this.price = price;
		this.count = count;
	}

	// 총 금액 계산 
	public int getTotalPrice() {
/* return price * count;는 "단가와 수량을 곱한 결과(예: 9000원)를 만든 뒤, "
* "자기를 불러준 곳에 그 값을 전달하며 함수를 끝낸다"는 뜻입니다.
* 
* 계산: price * count (4500 × 2 = 9000) =-> 돌려줌(return): 메서드를 호출한 자리를 9000이라는 값으로 바꿔놓고 종료
*/
//곱한값 돌려줌  (단가 * 수량)
		return price * count;
	}

	// 수량 추가
	public void addCount(int add) {
		count += add;
		System.out.println("수량이 [" + add + "]개 추가되어 총 [" + count + "]개가 되었습니다.");
	}

	// 주문 정보 출력
	public void printOrderInfo() {
		int totalPrice = getTotalPrice();
		System.out.println("[" + menuName + "] [" + count + "]잔 - 총 결제금액: [" + totalPrice + "]원");

	}

}
