package MyApp;

public class User {

	public static void main(String[] args) {
		
		Application app = new Application("harshita" , "test@123");
		app.doLogin();
		
		Application app1 = new Application();
		app1.setUsername("daksh");
		app1.setPassword("user@123");
		app1.doLogin();
		
		System.out.println(app1.getUsername());
		System.out.println(app1.getPassword());
		
		

	}

}
