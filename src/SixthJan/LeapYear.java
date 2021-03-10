package SixthJan;

public class LeapYear {
	public String getLeapYear(int n) {
		if(n%4==0) {
			return "leap year";
		}
		else
			return "not a leap year";	
	}

	public static void main(String[] args) {
		LeapYear leapYear = new LeapYear();
		String leapYear2 = leapYear.getLeapYear(2021);
		System.out.println(leapYear2);
		
		
		
	}

}
