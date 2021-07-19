package project;

import java.util.Scanner;

public class Login {
	String userName, password;
	static Scanner sc = new Scanner(System.in);
	
	//take username and password from user input
	void input() {
		System.out.println("****************");
		System.out.println("Login Credential");
		System.out.println("****************");
		System.out.println("Enter Username:");
		this.userName = sc.nextLine();
		System.out.println("Enter Password:");
		this.password = sc.nextLine();
	}

	//return 1 if login successful or return 0 if login failed
	int validate() {
		if (this.userName.equalsIgnoreCase("admin") && this.password.equals("admin@123")) {
			System.out.println("****************");
			System.out.println("Login Successful");
			System.out.println("****************");
			return 1;
		} else {
			System.out.println("****************");
			System.out.println("Login Failed");
			System.out.println("****************");
			return 0;
		}
	}
}
