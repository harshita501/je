package SuperKeyword;

public class HR extends Department {
	int dept_code = 102;
	@Override
	public void getDeptID() {
		//System.out.println(super.dept_code);
		System.out.println("HR deptID");
	}
	
	public void getDeptInfo() {
		System.out.println("HR--- getHRInfo");
		super.getDeptInfo();
	}

	

}
