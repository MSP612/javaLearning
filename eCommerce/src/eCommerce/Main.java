package eCommerce;

import utils.utility;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		boolean flag = true;
		
		while(flag) {
			Menu.menuList();
			System.out.println("Enter your number to select menu item. Type exit to quit.");
			String input = utility.sc.next();
			flag = Menu.menuSelected(input);
		}
	}

}
