package StringManipulation;

public class StringAssignment {

	public static void main(String[] args) {
		
	 //1.Write a program to check two different strings equality.
		String s1 = "StringAssignment1";
		String s2 = "stringassignment1";
		System.out.println("1. "+s1.equalsIgnoreCase(s2));
		
	//2.Remove all  spaces in a String .
		String s3 = "   Hello   Everyone   ";
		System.out.println("2. "+s3.replaceAll("\\s", ""));
		
	//3. Write a program that will  print out the last character and first character of a word.
		String s4 = "Assignment";
		int n = s4.length();
		System.out.println("3. "+s4.charAt(0)+" "+s4.charAt(n-1));
		
	//4.Write a program to verify a word or a character contained in the sentence.
		String s5 = "Selenium web driver manager";
		if(s5.contains("driver")) {
			System.out.println("4. "+"character is available");
		}
		else {
			System.out.println("4. "+"character is not available");
		}
		
	//5.Write a function/ method to reverse your own name.
		String s6 = "Harshita";
		System.out.print("5. ");
		for (int i = s6.length()-1;i>=0;i--) {
			System.out.print(s6.charAt(i));
		}
		System.out.println("       ");
			
	//6.Write a program that gives you the last half of the string.
			String s7 = "Selenium web driver manager";
			System.out.println("6. "+s7.substring(13, s7.length()));
			
	//7.Write a program to get the 3rd  “ e “ of the string .
			String s8 =  "Welcome to Naveen Automation Labs !";
			System.out.println("7. "+s8.indexOf('e',s8.indexOf('e',s8.indexOf('e')+1)+1));
			
	//8.Write a method which gives an index of (-1) if string is not available.if String is present, then it should return the specific index.
			String s9 = "Automation Testing";
			if(s9.indexOf("Testing")==-1) {
				System.out.println("8. "+"string is not available");
			}
			else {
				System.out.println("8. "+s9.indexOf("Testing"));
			}
			
	//9.Write a program that breaks a whole string into small strings, and prints out its all values . 
			String s10 = "Selenium,web,driver,manager";
			String s10arr[] = s10.split(",");
			for(int i=0;i<s10arr.length;i++) {
				System.out.println("9. "+s10arr[i]);
			}
			
	//10.Assume that a string consists of 3 words, print out the middle one. 
			String s11 = "welcome to testing";
			int position;
			int length;
			if(s11.length()%2==0) {
				position = s11.length()/2-1;
				length = 1;
			}
			else {
				position = s11.length()/2;
				length = 0;
			}
			System.out.println("10. "+s11.charAt(position)+s11.charAt(position+length));
	
	//11.get only numeric part from this String:
		  String s12 = "your transaction id is: 12345 and reference id is 34567";
		  String s13=s12.substring(s12.indexOf("is")+4);
		  String temp=s12.substring(s12.indexOf("is")+4,s12.indexOf("is")+9);
		  System.out.println("11. "+temp);
		  System.out.println("11. "+s13.substring(s13.lastIndexOf("is")+3));
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			
		
		

	}

}
