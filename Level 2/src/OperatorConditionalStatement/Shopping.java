package OperatorConditionalStatement;

public class Shopping {

	public static void main(String[] args) {
		int price = 45000; //(구매 금액)
	    int shippingFee = 3000; //(기본 배송비)
	    int totalPrice;
	    
	    //조건문(50000원 이상인 경우)
	    if(price <= 50000) 
	    {
	    
	    }
	    else if(shippingFee == 0) 
	    {
	       price -= price * 0.1;
	    }else if(price < 30000 && price > 50000) 
	    {
	       shippingFee = 0;
	    }else if(price > 30000) {
	    	shippingFee = 3000;
	    }
	    System.out.println(totalPrice = price + shippingFee);

}
}