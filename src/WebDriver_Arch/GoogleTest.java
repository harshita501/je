package WebDriver_Arch;

public class GoogleTest {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {
		//String browser = "opera";
		//driver = new ();
//		
//		WebDriver driver = null;
//		driver = new ChromeDriver();
//		driver = new FireFoxDriver();
//		driver = new InternetExplorerDriver();
		
		//TopCasting : cross browser testing
//		if(browser.equals("chrome")) 
//		{
//			driver = new ChromeDriver();
//		}
//		else if(browser.equals("firefox"))
//		{
//			driver = new FireFoxDriver();
//		}
//		else if(browser.equals("internetexplorer"))
//		{
//			driver = new InternetExplorerDriver();
//		}
//		else
//		{
//			System.out.println("please pass the correct browser name");
//		}
		
		
		
		
		
		String browser = WebDriver.getDriverName("http://www.kuchBhi.com");
		initializeDriver(browser);
		String title = driver.getTitle();
		System.out.println("page title is : "+ title);
		
		//verification or check point
		if(title.equalsIgnoreCase("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		driver.findElement("test_id");
		driver.sendKeys();
		driver.click();
		driver.close();

	}


	private static void initializeDriver(String browser) {
		switch(browser.toLowerCase()) {
		case "chrome":driver = new ChromeDriver();
		break;
		case "firefox":driver = new FireFoxDriver();
		break;
		case "internetexplorer":driver = new InternetExplorerDriver();
		break;
		default:driver = new InvalidDriver();;
		
		}
	}

}
