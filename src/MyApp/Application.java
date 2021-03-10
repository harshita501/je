package MyApp;

public class Application {
	
	private String username;
	private String password;
	
	public Application(){
		System.out.println("application default const...");
		
	}
	
	public Application(String username, String password) {
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
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
	public void doLogin() {
		System.out.println("Login with : "+ username + ":"+ password);
	}


}
