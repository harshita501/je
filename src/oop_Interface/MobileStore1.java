package oop_Interface;

public class MobileStore1 extends MobileStore3 implements iPhone, Samsung, OPPO {
	//iPhone
	@Override
	public void iphone10() {
	System.out.println("iphone10 is available at store1");	
		
	}

	@Override
	public void iphone11() {
		System.out.println("iphone11 is available at store1");	
	}

	@Override
	public void iphone12() {
		System.out.println("iphone12 is available at store1");	
	}

	@Override
	public void totaliphone(int count) {
		System.out.println("Total count at store1 "+ count);
	}

	@Override
	public String getReleaseInfo() {
		
		return "iphone releaseinfo at Store1";
	}

	//Samsung
	
	@Override
	public void sSeries() {
		System.out.println("Samsung sSeries is available at store1");
		
	}

	@Override
	public void noteSeries() {
			System.out.println("noteSeries is available at store1");
	}

	//OPPO
	@Override
	public void oppoF4() {
		System.out.println("oppoF4 is available at store1");	
	}

	@Override
	public void oppoF5() {
		System.out.println("oppopF5 is available at store1");	
	}
	
	//own class methods(Non overridden methods)
	
	public void getDiscount() {
		System.out.println("Discount available on all iphone");
	}
	
	public void getVouchers() {
		System.out.println("Vouchers available on all samsung phone");
	}

	//softwareTestingRequired
	
	@Override
	public void mandotrySoftwareTesting() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void productionOfMobile() {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	



}
