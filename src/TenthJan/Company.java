
package TenthJan;

public class Company {
	String name;
	int empCount;
	String logo;
	String HQ;
	String ceoName;
	
	public Company(String name, int empCount, String logo, String HQ, String ceoName) {
		this.name = name;
		this.empCount = empCount;
		this.logo = logo;
		this.HQ = HQ;
		this.ceoName = ceoName;
	}

	public Company(String name, int empCount) {
		this.name = name;
		this.empCount = empCount;
	}

	public Company(String name, String ceoName) {
		this.name = name;
		this.ceoName = ceoName;
	}
	
	public String getCompanyName() {
		return name;
	}
	
	public String getCompanyInfo() {
		return "some comp info";
	}
}
