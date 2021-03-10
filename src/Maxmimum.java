
public class Maxmimum {
	public int max(int a , int b , int c) {
		int greaterNumber = a;
		if(greaterNumber<b) {
			greaterNumber = b;
		}
		if(greaterNumber<c) {
			greaterNumber = c;
		}
		return greaterNumber;
	}
	public int min(int a, int b , int c) {
		int minNumber = a;
		if(minNumber>b) {
			minNumber = b;
		}
		if(minNumber>c) {
			minNumber = c;
		}
		return minNumber;
	}
	
	public static void main(String[] args) {
		Maxmimum greater = new Maxmimum();
	int g =	greater.max(1 , 2 , 3);
		System.out.println(g);
		Maxmimum minimum = new Maxmimum();
	int m =	minimum.min(3, 1, 2);
        System.out.println(m);
	}

}
