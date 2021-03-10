package EncapsulationTest;

public class StudentSample {

	public static void main(String[] args) {
		
		Student studentData = new Student();
		studentData.setStdName("Harshita");
		studentData.setStdId(101);
		studentData.setStdRollNo(10);
		String name = studentData.getStdName();
		int studentID = studentData.getStdId();
		int rollno = studentData.getStdRollNo();
		System.out.println(name+" "+studentID+" "+rollno);
	}

}
