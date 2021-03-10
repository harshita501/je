package ConstructorAssignment;
import java.util.ArrayList;

public class University {
	private String universityName;
	private String countryName;
	private String establishedDate;
	private ArrayList<String> listOfCourse = new ArrayList<String>();
	
	
	public University(String universityName, String countryName, String establishedDate, ArrayList<String> listOfCourse) {
		this.universityName = universityName;
		this.countryName = countryName;
		this.establishedDate = establishedDate;
		this.listOfCourse = listOfCourse;
	}
	public University(String universityName, String countryName) {
		this.universityName = universityName;
		this.countryName = countryName;
	}
	public University(String universityName, ArrayList<String> listOfCourse) {
		this.universityName = universityName;
		this.listOfCourse = listOfCourse;
	}
	
	
	public String getuniversityName() {
		return this.universityName;	
	}
	public String getcountryName() {
		return this.countryName;	
	}
	public String establishedDate() {
		return this.establishedDate;
	}
	public ArrayList<String> getlistOfCourse(){
		return this.listOfCourse;	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	


