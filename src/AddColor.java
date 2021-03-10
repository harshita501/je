
import java.util.ArrayList;
import java.util.Collections;
public class AddColor {
	public static void main(String[] args) {
//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		ArrayList<String> color= new ArrayList<String>();
		color.add("white");
		color.add("Black");
		color.add("Orange");
		color.add("Green");
		System.out.println("1st Answer: " +color);
//2. Write a Java program to insert an element into the array list at the first and last positions.
		color.add(0, "Red");
		color.add(5, "violet");
		System.out.println("2nd Answer: "+color);	
//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println("3rd Answer: "+"Third element: "+ color.get(3));
//4. Write a Java program to update specific array element by given element.
		color.set(2, "Yellow");
		System.out.println("4th Answer: "+color);
//5. Write a Java program to remove the third element from a array list. 
		color.remove(3);
		System.out.println("5th Answer: "+color);
//6. Write a Java program to search an element in a array list.
		if(color.contains("Red"))
		System.out.println("6th Answer: "+"Found");
		else {
			System.out.println("6th Answer: "+"NotFound");	 }
//7. Write a Java program to reverse elements in a array list
    Collections.reverse(color);
	System.out.println("7th Answer: "+color);
//8. Write a Java program to extract a portion of a array list.
	System.out.println("8th Answer: "+color.subList(0, 3));
//9. Write a Java program of swap two elements in an array list.
	Collections.swap(color, 0, 3);;
	System.out.println("9th Answer: "+color);
//10. Write a Java program to empty an array list.
	//color.removeAll(color);
	//System.out.println("10th Answer: "+"empty array list "+ color);
//11. Write a Java program to trim the virtual capacity of an array list the current list size.
	color.trimToSize();;
	System.out.println("11th answer: "+color);
//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
	for(int i = 0;i < color.size();i++)
		System.out.println("12th Answer: "+color.get(i));	
	
//	for(String s : color) {
//		System.out.println(s);
//	}
	
	
	
	
	
	
	
	
	
}
}