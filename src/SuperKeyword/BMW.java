package SuperKeyword;

public class BMW extends Car {
	
	private String name1;
	private int price1;
	
	
	public BMW() {
		super(); //should be the first statement
		System.out.println("BMW default const");
		
	}
	
	public BMW(String name,int price) {
		//super(); not allowed to write 2 super keyword at a time.use only one
		super(name, price); 
		this.name1 = name;
		this.price1 = price;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public int getPrice1() {
		return price1;
	}

	public void setPrice1(int price1) {
		this.price1 = price1;
	}
	
	

}
