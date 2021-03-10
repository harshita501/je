package WebDriver_Arch;

public interface WebDriver extends SearchContext {
	
	@Override
	public void findElement(String locator);
	
	public static String getDriverName(String url) {
		if(url.contains("google"))
			return"Chrome";
		else if(url.contains("firefox"))
			return"Firefox";
		else if(url.contains("explorer"))
			return "InternetExporer";
		return"invalidBrowser";
	}
	
	public String getTitle();
	
	public void click();
	
	public void sendKeys();
	
	public void close();

}
