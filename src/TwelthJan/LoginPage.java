package TwelthJan;

public class LoginPage {
	private String username;
	private String password;
	
	public LoginPage() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public LoginPage(String username , String password) {
		this.username = username;
		this.password = password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
	this.password = password;
	}
	
	public void doLogin(String un , String pwd) {
		System.out.println("entering username : "+ un);
		System.out.println("entering password : "+ pwd);
		System.out.println("click on login");
		System.out.println("login is done");	
	}
	public void logOut() {
		System.out.println("Logout from the app");
	}

}
