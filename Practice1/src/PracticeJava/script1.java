package PracticeJava;


public class script1 {
	public static void main(String[] args) {
		String s = "Selenium";
		System.out.println(s.repeat(2));
		
		int length = s.length();
		String reverseString = "";
		for(int i=length-1; i>=0; i--) {
			reverseString = reverseString + s.charAt(i);
		}

		System.out.println(reverseString);
		
		
		StringBuffer sf = new StringBuffer("Manish");
		System.out.println(sf.reverse());
		
	}
	
}
