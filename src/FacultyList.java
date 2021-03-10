
public class FacultyList {
	public String[] getCollegeFaculty(String collegeName) {
		
		String IIMBFaculty[] = {"Tom" , "Steve" , "Peter"};
		
		String SRMFaculty[] = {"Sujan" , "Nidhi" , "Sunil"};
		
		String IITDFaculty[] = {"Lisa" , "Abhishek" , "Divya"};
		
		if(collegeName.equalsIgnoreCase("IIMB"))
			return IIMBFaculty;
		else if(collegeName.equalsIgnoreCase("SRM"))
			return SRMFaculty;
		else if(collegeName.equalsIgnoreCase("IITD"))
			return IITDFaculty;
		return null;
			
	}
	public static void main(String[] args) {
		FacultyList facultyList = new FacultyList();
		String[] collegeFaculty = facultyList.getCollegeFaculty("IIMB");
		for (int i = 0; i < collegeFaculty.length; i++) {
			System.out.println(collegeFaculty[i]);
		}
		

	}

}
