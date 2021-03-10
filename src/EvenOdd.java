
public class EvenOdd {
	public String number(int a) {
		
		
		if(a%2==0) {
			return "even";
		}
			
		
		else {
			return "odd";
		}

	}
	

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		String number = eo.number(5);
		System.out.println(number);

	}

}
