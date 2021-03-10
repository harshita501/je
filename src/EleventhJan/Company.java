package EleventhJan;

public class Company {
	public String name;
	private int shareprice;
	private String policy;
	
	
	public void getCompanyInformation() {
		System.out.println("get some info....");
	}
	
	public void getImpInfo() {
		getCompanyShare();
	}
	
	private void getCompanyShare() {
		System.out.println("get share info....");
	}
	
}
