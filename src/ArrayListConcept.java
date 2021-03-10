import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
     ArrayList ar = new ArrayList();
		
		System.out.println(ar.size());//0 --PC
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size()); //2 -- PC
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size()); //4 -- PC

		ar.add(500);//4
		ar.add(600);//5
		ar.add(700);//6
		ar.add(800);//7
		ar.add(900);//8
		ar.add(400);//9
		
		System.out.println(ar.size()); //10 -- PC

		ar.add(400);//10
		ar.add(400);

	}

}
