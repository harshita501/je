
public class CricketTeam {
	
	static CricketPlayer cricketTeam[] = new CricketPlayer[2];


	public static void main(String[] args) {
		CricketPlayer c1 = new CricketPlayer();
			c1.setAge(28);
			c1.setName("virat");
			c1.setTeam ("RCB");
			c1.setDOB("13.04.89");
			c1.setGender('M');
			c1.setStrike (97.0);
			cricketTeam[0]=c1;
			
			CricketPlayer c2 = new CricketPlayer();
			c2.setAge(28);
			c2.setName("Dhoni");
			c2.setTeam ("Chennai superking");
			c2.setDOB("13.04.89");
			c2.setGender('M');
			c2.setStrike (83.0);
			cricketTeam[1]=c2;
			
		for (int i=0;i<cricketTeam.length;i++)	{
			
			System.out.println("age : "+cricketTeam[i].getAge());
			System.out.println("DOB : "+cricketTeam[i].getDOB());
			System.out.println("Gender : "+cricketTeam[i].getGender());
			System.out.println("Name : "+cricketTeam[i].getName());
			System.out.println("Strike : "+cricketTeam[i].getStrike());
			System.out.println("Team : "+cricketTeam[i].getTeam());
			System.out.println("--------------");
			
		}
	}

}
