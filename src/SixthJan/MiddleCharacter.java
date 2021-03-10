package SixthJan;

public class MiddleCharacter {
	public void getMiddleCharacterOfString(String term) {
		//String term="540";
		//if(String.length/2==0) {
			
			if(term.length()%2!=0) {
				System.out.println(term.charAt(term.length()/2+1));	
			
		}
			else if(term.length()%2==0) {
				System.out.println(term.charAt(term.length()/2-1)+" , "+ term.charAt(term.length()/2));
			}	
		
	}
	public static void main(String[] args) {
		MiddleCharacter middleCharacter= new MiddleCharacter();
		middleCharacter.getMiddleCharacterOfString("5400");
		

	}

}
