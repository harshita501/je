import java.util.Scanner;

public class Armstrong2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int c = 0,a,temp;
		temp = n;
		while(n>0) {
			a = n%10;
			n = n/10;
			c = c+(a*a*a);
		}
		if(temp==c)
			System.out.println("its armstrong number");
		else
			System.out.println("not armstrong number");

	}

}
