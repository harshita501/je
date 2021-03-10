package oop_Interface;

public class MobileStoreSample {

	public static void main(String[] args) {
		MobileStore1 ms1 = new MobileStore1();
		ms1.iphone10();
		ms1.noteSeries();
		ms1.oppoF4();
		ms1.totaliphone(1000);
		String releaseInfo = ms1.getReleaseInfo();
		System.out.println(releaseInfo);
		
		ms1.getDiscount();
		ms1.getVouchers();
		
		System.out.println(iPhone.iPhone12_price);
		iPhone.latestOSVersion();
		ms1.callFeature();
		
		//top casting
		 iPhone ip = new MobileStore1();
		

	}

}
