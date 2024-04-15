package registration;

import utils.utility;


public class SignUp{
	
	private String fName;
	
	private String lName;
	
	private String password;
	
	private String email;
	
	
	public SignUp() {
		System.out.print("Enter your First Name: ");
		setfName(utility.sc.next());
		System.out.print("Enter your Last Name: ");
		setlName(utility.sc.next());
		System.out.print("Enter your Password: ");
		setPassword(utility.sc.next());
		System.out.print("Enter your Email Address: ");
		setEmail(utility.sc.next());

		System.out.print("Successfully Registered ");
	}
	
	
	public String getfName() {
		return fName;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		return lName;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
}
