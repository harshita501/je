package oop_Inheritance;

public class MobileSample {

	public static void main(String[] args) {
		
		iPhone mobileiPhone = new iPhone();
		
		//Run time PolyMorphism
		mobileiPhone.switchOn();
		mobileiPhone.scrollScreen();
		mobileiPhone.switchOff();
		mobileiPhone.iOS();
		mobileiPhone.allLatestTechnologies();
		
		System.out.println(mobileiPhone.imeiNumber());
		
		Mobile mobilePhone = new Mobile();
		mobilePhone.switchOn();
		mobilePhone.scrollScreen();
		mobilePhone.switchOff();
		mobilePhone.allLatestTechnologies();
		
		Samsung samsungPhone = new Samsung();
		samsungPhone.switchOn();
		samsungPhone.knoxTest();
		
		
		//Top Casting
		Mobile mobilePhone1 = new iPhone();
		mobilePhone1.switchOn();
		mobilePhone1.scrollScreen();
		mobilePhone1.switchOff();
		
		
		MobileAllTechnologies latestTechnologies = new iPhone();
		latestTechnologies.allLatestTechnologies();
		
		

	}

}
