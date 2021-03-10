
public class StringBatman {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("I am Batman");
		}
		System.out.println("----------------");
		for(int i=1 ;i<=9;i++) {
			System.out.println("I am Batma" +i);
		}
		System.out.println("----------------");
		
		for(int i=10 ; i>=1 ; i--) {
			System.out.print(i + " ");
		}
		System.out.println("        ");
		System.out.println("----------------");
		int i=10;
		while(i>=1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println("        ");
		System.out.println("----------------");
		int j=10;
		do {
			System.out.print(j + " ");
			j--;
		}
		while(j>0);
		System.out.println("        ");
		System.out.println("----------------");
		
		int k=10;
		while(k>=1) {
			System.out.println("Hello World");
			k--;
		}
		System.out.println("        ");
		System.out.println("----------------");
		int l=1;
		while(l<=10) {
			if (l!=7){
				System.out.print(l + " ");	
			}
			l++;
		}
		System.out.println("        ");
		System.out.println("----------------");
		for(int m=4 ; m>=0 ; m--) {
			System.out.println("n = " + m);
		}
		System.out.println("----------------");
		
		for(int n=0 ; n<=9 ; n++) {
			for(int p=0 ; p<=9 ; p++) {
				System.out.print(n+""+p+ " ");
			}
			System.out.println(" ");
		}	
	}
}
