package TwelthJan;

public class BrowserSample {

	public static void main(String[] args) {
		Browser br = new Browser();
		
		br.launchBrowser();
		
		br.setVersion(50);
		int v = br.getVersion();
		System.out.println(v);

	}

}
