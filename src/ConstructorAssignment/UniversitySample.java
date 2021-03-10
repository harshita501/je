package ConstructorAssignment;

import java.util.ArrayList;

public class UniversitySample {

	public static void main(String[] args) {
		
		ArrayList<String> usaListOfCourse = new ArrayList<String>();
		usaListOfCourse.add("MS");
		usaListOfCourse.add("MBA");
		usaListOfCourse.add("Law");
		University usaUniversity = new University("Boulder","USA","14-04-1980",usaListOfCourse);
		System.out.println(usaUniversity.getuniversityName()+" "+usaUniversity.getcountryName()+" "+usaUniversity.establishedDate()+" "+usaUniversity.getlistOfCourse());



        ArrayList<String> indiaListOfCourse = new ArrayList<String>();
        indiaListOfCourse.add("b.tech");
        indiaListOfCourse.add("m.tech");
        indiaListOfCourse.add("m.com");
        University indiaUniversity = new University("IITDelhi" , indiaListOfCourse);
        System.out.println(indiaUniversity.getuniversityName()+" "+indiaUniversity.getlistOfCourse());

	}
}
