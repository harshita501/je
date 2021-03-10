package oop_Inheritance;

public class Mobile extends MobileAllTechnologies {
	private int imeiNumber;
	private String camera;
	
	public void switchOn() {
		System.out.println("mobile is switchOn");
	}
	
	public void scrollScreen() {
		System.out.println("mobile screen is scrolling");
	}
	
	public void switchOff() {
		System.out.println("mobile get switchOff");
	}
	
	public int imeiNumber() {
		return imeiNumber;
	}
	
	public String cameraApp() {
		return camera;
	}
	
	public static void chipSet() {
		System.out.println("mobile chipset");
	}

}
