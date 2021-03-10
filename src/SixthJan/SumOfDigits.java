package SixthJan;

public class SumOfDigits {
	public int getSumOfTheDigits(int n) {
		int temp =0;
		while(n>0) {
			temp = temp+n%10;
			n = n/10;
		}
		return temp;
	}

	public static void main(String[] args) {
		SumOfDigits sumOfDigits = new SumOfDigits(); 
		int sumOfTheDigits = sumOfDigits.getSumOfTheDigits(25);
		System.out.println(sumOfTheDigits);
	}

}
