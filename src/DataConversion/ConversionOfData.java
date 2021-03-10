package DataConversion;

public class ConversionOfData {

	public static void main(String[] args) {
		//String to int
		String s = "100";
		int i = Integer.parseInt(s);
		System.out.println(i+20);
		
		String y = "100A";
		String x = y.substring(0, 3);
		System.out.println(x);
		int j = Integer.parseInt(x);
		System.out.println(j+2);
		
		//String to double
		String p = "12.33";
	   double d = Double.parseDouble(p);
	   System.out.println(d+20);
	   
	   //int to String
	   int marks = 100;
	  String c = String.valueOf(marks);
	  System.out.println(c+20);
	  
	  //double to String
	  double salary = 34.44;
	  String s1 = String.valueOf(salary);
	  System.out.println(s1+500);
	  
	  //boolean to string
	  Boolean b = true;
	  String s2 = String.valueOf(b);
	  System.out.println(s2);

	}

}
