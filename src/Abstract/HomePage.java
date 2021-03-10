package Abstract;

public class HomePage extends Page {
	
	@Override
	public void title() {
		System.out.println("My home title");
	
	}

	@Override
	public void header() {
		System.out.println("home page header");
		
	}

	@Override
	public void url() {
		System.out.println("http://www.xyz.com/homepage.jsp");
		
		
	}

}
