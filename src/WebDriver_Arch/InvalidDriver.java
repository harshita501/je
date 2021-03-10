package WebDriver_Arch;

public class InvalidDriver implements WebDriver {
	
	public InvalidDriver(){
		System.out.println("Not a valid Driver");
		//System.out.println("Chrome browser is launched");
	}

	@Override
	public void findElement(String locator) {
		System.out.println("finding the elements "+ locator);
	}

	

	@Override
	public String getTitle() {
		System.out.println("getting page title");
		return "Not a valid Driver";
	}

	@Override
	public void click() {
		System.out.println("click on element");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("enter the values in text fields");
		
	}

	@Override
	public void close() {
		System.out.println("closing the browser");
		
	}

}
