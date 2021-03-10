package SixthJan;

public class CountAllWords {
	public int getCountOfAllTheWords(String str) {
		
		String[] split = str.split(" ");
		
		
        return split.length; 	
	}
	public static void main(String[] args) {
		CountAllWords countAllWords = new CountAllWords();
		int countOfAllTheWords = countAllWords.getCountOfAllTheWords("the quick brown");
		System.out.println(countOfAllTheWords);
	}

}
