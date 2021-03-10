
public class Browser {
	
	public void launchBrowser(String browserName) {
		
		//System.out.println("browser name is: "+ browserName);
		
		switch(browserName.toLowerCase()) {
		case "chrome": browserName = "Chrome";
		//System.out.println("browser name is: "+ browserName);
		break;
		case "firefox": browserName = "Firefox";
		//System.out.println("browser name is: "+ browserName);
		break;
		case "ie": browserName = "InternetExplorer";
		//System.out.println("browser name is: "+ browserName);
		break;
		default:System.out.println("InvalidBrowser");
		
		}
		System.out.println("browser name is: "+ browserName);
		
	}
	
	public static void main(String[] args) {
		Browser br = new Browser();
		br.launchBrowser("CHrome");
		

	}

}
