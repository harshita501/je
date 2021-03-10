
public class WeekDays {
	
	public void days(String day) {
		
		String arr[] = {"Mon" , "Tue" , "Wed" , "thus" , "Fri" , "sat" ,"sun"};
		for(int i=0 ; i<=arr.length-1 ; i++) {
			
			if(arr[i]==day) {
				for(int j=i ; j<=arr.length-1 ; j++) {
					System.out.println(arr[j]);
					
				}
				
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		WeekDays Total = new WeekDays();
		Total.days("sat");
		
	}

}
