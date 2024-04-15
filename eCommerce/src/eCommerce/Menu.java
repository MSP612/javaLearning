package eCommerce;

import registration.SignUp;

public class Menu {
	
	public static void menuList() {
		
		System.out.println("1. Sign Up\r\n"
				+ "2. Sign In / Sign Out \r\n"
				+ "3. Product Catalog\r\n"
				+ "4. My Orders\r\n"
				+ "5. Settings\r\n"
				+ "6. Customer List\r\n");
	}
	
	public static boolean menuSelected(String num) throws InterruptedException {
		num = num.toLowerCase(); 
		switch(num){
			case "1":{
				SignUp signUp = new SignUp();
				return true;
			}
			case "2":{
				
				return true;
			}
			case "3":{
				
				return true;
			}
			case "4":{
				
				return true;
			}
			case "5":{
				
				return true;
			}
			case "6":{
				
				return true;
			}
			case "exit":{
				
				return false;
			}
			default:{
				System.out.println("Incorrect input");
				System.out.println("Try again.\n\n\n\n");
				Thread.sleep(1000);
				return true;
			}
		}
			
				
	}
}
