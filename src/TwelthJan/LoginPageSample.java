package TwelthJan;

public class LoginPageSample {

	public static void main(String[] args) {
		//LoginPage lp = new LoginPage("harshita@gmail.com" , "test123");
		
		//lp.setUsername("harshita@gmail.com");
		//lp.setPassword("test123");
		//lp.doLogin(lp.getUsername(), lp.getPassword());
		//lp.logOut();
		
		//lp.setUsername("seller@gmail.com");
		//lp.setPassword("tesing123");
		//LoginPage lp1 = new LoginPage("seller@gmail.com" , "testing123");
		//lp.doLogin(lp1.getUsername(), lp1.getPassword());
		//lp.logOut();
		
		
		LoginPage lp = new LoginPage();
		lp.setUsername("harshita@gmail.com");
		lp.setPassword("test123");
		lp.doLogin(lp.getUsername(), lp.getPassword());
		lp.logOut();
		
		

	}

}
