
public class Voting {
	public String eligibleForVote(int person) {
		if(person >= 18) {
			return "He/She eligible for voting";
		}
		else {
			return "not eligible for voting";
		}
		
	}

	public static void main(String[] args) {
		Voting vote = new Voting();
		String eligibleForVote = vote.eligibleForVote(20);
		System.out.println(eligibleForVote);

	}

}
