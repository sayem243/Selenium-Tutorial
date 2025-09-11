package arrayPractice;

public class StringPractic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Welcome";
		System.out.println(s.charAt(0));
		System.out.println(s.contains("come"));
		String s2="welcome to java selenium class";
		System.out.println(s2.replace("java", "js"));
		
		//substring()-> extract substring from main string
		
		String ab= "Selenium";
		String sub =ab.substring(1, 3);
		System.out.println(sub);
		
	}

}
