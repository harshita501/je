package TwelthJan;

public class Browser {
	private int version;
	
	public void setVersion(int version) {
		this.version = version;
	}
	public int getVersion() {
		return version;
	}
	public void launchBrowser() {
		System.out.println("Browser getting launched");
		checkBrowseerVersion();
		checkRAM();
		osCompatible();
		checkBrowserUpdate();	
		System.out.println("Browser is launched");
	}
	private void checkBrowseerVersion() {
		System.out.println("checkBrowserVersion");
	}
	private void checkRAM() {
		System.out.println("checkRAM");
	}
	private void osCompatible() {
		System.out.println("osCompatible");
	}
	private void checkBrowserUpdate() {
		System.out.println("checkBrowserUpdate");
	}

}
