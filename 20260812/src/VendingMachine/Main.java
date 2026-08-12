package VendingMachine;

public class Main {

	public static void main(String[] args) 
	{
		//드링크 클래스 List 변수 선언
		Drink[] List = new Drink[4];

		//List에 담을 상품명
		String[] name = {"콜라","사이다","환타","커피"};
		//List에 담긴 상품의 가격
		int[] prices = {1500, 1200, 0, 2000};

		//List 배열 데이터 처리
		for(int i = 0; i < List.length; i++) 
		{ 
			{ 
				List[i] = new Drink(name[i], prices[i]);

				//조건
				//상품의 가격이 0 이하인 경우
				if(List[i].price <= 0) 
				{ 
					continue;
				}

				//상품의 가격이 2000원 이상인 경우
				if(List[i].price >=2000) 
				{
					List[i].printInfo();
					System.out.println("2000원 이상 음료를 발견해서 점검을 종료합니다.");
					break;
				}
//				List[i].printInfo();
			}
		}

	}
}
