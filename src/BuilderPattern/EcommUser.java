package BuilderPattern;

public class EcommUser {

	public static void main(String[] args) {
		EcommApp shop = new EcommApp();
		shop
		.login("harshita", "test123")
		.doSearch("macBook", 1000)
		.addToCart("macbook")
		.doPayment("ICICI 12345", "user1223")
		.getEmail()
		.logout();
		
		int orderID = shop.generateOrderId();
		System.out.println(orderID);
				
		

	}

}
