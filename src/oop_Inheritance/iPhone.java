package oop_Inheritance;

public class iPhone extends Mobile{
	private String camera="iosCamera";
	
	
	@Override
	public void switchOn(){
		System.out.println("iPhone is switchOn");
		super.switchOn();
	}
	
	public void iOS() {
		System.out.println("iPhone iOS ");
	}
	@Override
	public int imeiNumber() {
		return 123;
	}
	
	@Override
	public String cameraApp() {
		return this.camera;
	}
	
	public static void chipSet() {
		System.out.println("iPhone chipset");
	}
	
	@Override
   public void allLatestTechnologies() {
		
		System.out.println("iPhone latest technology");
	}

}
