package oop_Interface;

public interface iPhone extends softwareTestingRequired, MobileProduction {
	
	int iPhone12_price = 50000;
	
	public void iphone10();
	
	public void iphone11();
	
	public void iphone12();
	
	public void totaliphone(int count);
	
	public String getReleaseInfo();
	
	public static void latestOSVersion(){
		System.out.println("latest OS in iPhone is 14.3");
	}
	
	default void callFeature() {
		System.out.println("call Feature same in all iphone");
	}
	

}
