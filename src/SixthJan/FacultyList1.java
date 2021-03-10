package SixthJan;

import java.util.ArrayList;

public class FacultyList1 {
	public ArrayList<String> getCollegeFacultyList(String collegeName){
		ArrayList<String> facultyList = new ArrayList<String>();
		switch(collegeName) {
		case "IIMB":
			facultyList.add("TOM");
			facultyList.add("Steve");
			facultyList.add("Peter");
			break;
		case "SRM":
			facultyList.add("Sijan");
			facultyList.add("Nidhi");
			facultyList.add("Sunit");
			break;
		case "IITD":
			facultyList.add("Lisa");
			facultyList.add("Abhishek");
			facultyList.add("Divya");
			break;
			default:
				System.out.println("college name not found");
				break;	
		}
		return facultyList;		
	}
	public static void main(String[] args) {
		FacultyList1 FL = new FacultyList1();
		ArrayList<String> SRMList = FL.getCollegeFacultyList("SRM");
		System.out.println(SRMList);

	}

}
