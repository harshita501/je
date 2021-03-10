package Abstract;

public class LoginPage extends Page {
	public LoginPage() {
		System.out.println("login page class const");
	}

	@Override
	public void title() {
		System.out.println("My login title");
	
	}

	@Override
	public void header() {
		System.out.println("Login page header");
		
	}

	@Override
	public void url() {
		System.out.println("http://www.xyz.com/Loginpage.jsp");
		
	}
	@Override
	public void loadingTimeOut() {
		System.out.println("loading time 10 secs");
	}

}
