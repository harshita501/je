//1. Write a program to print the sum of two numbers entered by defining your own method.
public class Calculate {
	public int addition(int a , int b) {
		int c = a+b;
		return c;
	}
//2. Define a method that returns the product of two numbers entered by user.
	public int getProduct(int a,int b) {
		int number = a*b;
		return number;
		
	}
//3. Write a program to print the circumference and area of a circle of radius entered  by defining your own method.
	public double getCircumference(int r) {
		double d = 3.17;
		double c = (2*d*r);
		return c;
	}
	public double getAreaOfCircle(int r) {
		double d = 3.17;
		double a = (d * r * r);
		return a;
	}
//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered.
	public int max(int a , int b , int c) {
		int greaterNumber = a;
		if(greaterNumber<b) {
			greaterNumber = b;
		}
		if(greaterNumber<c) {
			greaterNumber = c;
		}
		return greaterNumber;
	}
	public int min(int a, int b , int c) {
		int minNumber = a;
		if(minNumber>b) {
			minNumber = b;
		}
		if(minNumber>c) {
			minNumber = c;
		}
		return minNumber;
	}
//5. Define a program to find out whether a given number is even or odd.
public String evenOrOdd(int a) {
		if(a%2==0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
//6. A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote
public String eligibilityForVote(int person) {
	if(person >= 18) {
		return "He/She eligible for voting";
	}
	else {
		return "not eligible for voting";
	}
	
}
//7. Write a program which will ask the user to enter his/her marks (out of 100). 
public String getStudentGrade(int marks) {
	if(marks>=91 && marks<=100) {
		return "AA";
	}
	else if(marks>= 81 && marks<=90) {
		return "AB";
	}
	else if(marks>=71 && marks<=80) {
		return "BB";
	}
	else if(marks>=61 && marks<=70) {
		return "BC";
	}
	else if(marks>=51 && marks<=60) {
		return "CD";
	}
	else if(marks>=41 && marks<=50) {
		return "DD";
	}
	else{
		return "Fail";
	}
	
}
	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		int s = calculate.addition(10, 20);
		System.out.println("Sum of two numbers is : "+ s);
		int number = calculate.getProduct(2, 4);
		System.out.println("The Product of two numbers is : "+ number);
		double areaOfCircle = calculate.getAreaOfCircle(3);
		double circumference = calculate.getCircumference(3);
		System.out.println("Area Of Circle is : "+areaOfCircle);
	    System.out.println("Circumference of Circle is : "+circumference);
		int g =	calculate.max(1 , 2 , 3);
			System.out.println("Maxmimum Number is : "+g);
		int m =	calculate.min(3, 1, 2);
	        System.out.println("Minimum Number is : "+m);
			String evnOrOdd = calculate.evenOrOdd(5);
			System.out.println("Number is Even or Odd : "+evnOrOdd);
			String eligibleForVote = calculate.eligibilityForVote(20);
			System.out.println(eligibleForVote);
			String studentResults = calculate.getStudentGrade(55);
			System.out.println("Grade is : "+studentResults);
	}
}
