package StringManipulation;

public class StringManipulationConcepts {

	public static void main(String[] args) {
		String str = "This is my java code and i am so happy";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf('i'));//1st occurrence of i
		//System.out.println(str.indexOf('i', 3));//2nd occurrence of i//its hard coded
		System.out.println("***********");
		System.out.println(str.indexOf('i')+1);
		System.out.println("************");
		System.out.println(str.indexOf("code"));
		
		System.out.println("-------------");
		
		String mesg = "welcome admin";
		
		if(mesg.indexOf("admin")>0) { //if you bother for index use †his logic
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		
		if(mesg.indexOf("admin")==8) {//if you sure for the index position use this one
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		if(mesg.indexOf("admin")==-1) {//if you don't bother for index use this one
			System.out.println("not available");
		}
		else {
			System.out.println("available");
		}
		
		String s1 = "welcome to testing";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		String s2 = "     hello world     ";
		System.out.println(s2.trim());
		
		String browser = "chrome ";
		if(browser.trim().equals("chrome")) {
			System.out.println("launch chrome");
		}
		
		String name = "your app name is amazon";
		if(name.contains("amazon")) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		 String url = "http://www.xyz.com/loginpage.jsp";
		 if(url.contains("loginpage")) {
			 System.out.println("true");
		 }
		 
		 String s11 = "testing selenium";
		 String s12 = "testing Selenium ";
		 System.out.println(s11.equals(s12));
		System.out.println(s11.equalsIgnoreCase(s12.trim()));
		
		String st = "this is my java code";
		System.out.println(st.substring(5));
		System.out.println(st.substring(8, 15));
		
		String stt = "your transcation id is 12345";
		System.out.println(stt.substring(stt.indexOf("is")+3, stt.length()));
		System.out.println(stt.substring(stt.indexOf("is")+3));
		
		String dob = "12-12-1990";
		System.out.println(dob.replace('-','/'));
		
		
		String lang = "JAVA;Python;Ruby;JavaScript";
		String langarr[] = lang.split(";");
		System.out.println(langarr[0]);
		System.out.println(langarr.length);
		
		for(String e : langarr) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println("-------------");
		
		//String str1 = "This is my java code and i am so happy this is my first java code";
		//System.out.println(str1.indexOf('i',str.indexOf('i')+3));
	
	}

}
