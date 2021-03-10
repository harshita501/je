package SixthJan;

public class AreaOfTriangle {
	
	public int getAreaOfTriangle(int base , int height ) {
		
		int area = (base * height)/2;
		return area;	
		
	}
	public static void main(String[] args) {
		AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
		
		int areaOfTriangle2 = areaOfTriangle.getAreaOfTriangle(2, 4);
		System.out.println(areaOfTriangle2);

	}

}
