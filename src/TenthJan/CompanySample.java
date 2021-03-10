package TenthJan;

public class CompanySample {

	public static void main(String[] args) {
		Company comp = new Company("Samsung",10000);
		System.out.println(comp.name+" "+comp.empCount);
		
		String companyInfo = comp.getCompanyInfo();
		System.out.println(companyInfo);
		
		Company comp1 = new Company("Facebook", 5000, "FB", "CFO", "Mark");
		System.out.println(comp1.name+" "+comp1.empCount+" "+comp1.logo+" "+comp1.HQ+" "+comp1.ceoName);
		
		
		
		
		
	
	}
	
	
	

}
