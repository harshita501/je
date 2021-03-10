import java.sql.Array;

public class CopyArray {
	

	public int[] copyOfArray() {
		int copyArr1[] = new int[] {1,2,3,4,5};
		
		int copyArr2[] = new int[copyArr1.length];
		for (int i=0 ; i<copyArr1.length ; i++) {
			copyArr2[i] = copyArr1[i];
		}
		return copyArr2;
		
	}
	

	public static void main(String[] args) {
		CopyArray ca = new CopyArray();
		int[] copyOfArray = ca.copyOfArray();
		for(int i=0 ; i<copyOfArray.length ; i++) {
			System.out.println(copyOfArray[i]);
			
		}
		
		
	
		
	}

}
