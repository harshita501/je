
public class BreakFastMenuitem2 {
	public void breakFastMenu(String day) {
		String menuItem = null;
		switch(day.toLowerCase()) {
		case "monday" : menuItem = "poha";
		break;
		case "tuesday" : menuItem = "upma";
		break;
		case "wednesday" : menuItem = "egg";
		break;
		case "thursday" : menuItem = "paratha";
		break;
		case "friday" : menuItem = "macroni";
		break;
		case "saturday" : menuItem = "vermicilli";
		break;
		case "sunday" : menuItem = "cornflackes";
		break;
		//default:System.out.println("menuItem :" + menuItem);
		}
		System.out.println(day +" " + menuItem);
		
	}
	public static void main(String[] args) {
		BreakFastMenuitem2 breakFastitem = new BreakFastMenuitem2();
		breakFastitem.breakFastMenu("monday");
		

	}

}
