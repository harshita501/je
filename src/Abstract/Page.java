package Abstract;

public abstract class Page {
	public Page() {
		System.out.println("page class const....");
	}
	
	public abstract void title();
	
	public abstract void header();
	
	public abstract void url();
	
	public final void logo() {
		System.out.println("app----logo");
	}
	public void loadingTimeOut() {
		System.out.println("loading time 20 secs");
	}
	
	
	
	

}
