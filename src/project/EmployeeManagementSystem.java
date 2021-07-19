package project;

import java.util.Scanner;

public class EmployeeManagementSystem {
	static int login;
	static String ename;
	static Scanner sc = new Scanner(System.in);
	
	static Login log = new Login();
	static EmployeeDetails ed = new EmployeeDetails();
	static HolidayManagement hm=new HolidayManagement(); 
	
	public static void main(String[] args) {
		WelcomePage wp = new WelcomePage();
		int n = wp.begin();

		// To check login is failure or successful
		if (n == 1) {
			log.input();
			login = log.validate();
		} else
			System.exit(0);

		// Get Employee Details
		if (login == 1)
			ename=ed.details();
		else 
			loginChecker();
		
		if(ename.equals("sumit") || ename.equals("sruthy") || ename.equals("sneha"))
		{
			hm.manageHoliday(ename);
			while (true) {
				System.out.println("Do you want to continue(y/n):");
				char c = sc.next().charAt(0);
				if (c == 'y')
					hm.manageHoliday(ename);
				else
					System.exit(0);
			}
		}
		else 
			System.exit(0);
	}
	
	static void loginChecker()
	{
		System.out.println("Do you want to continue(y/n):");
		char ch = sc.next().charAt(0);
		if (ch == 'y') {
			log.input();
			login=log.validate();
			if (login == 1)
				ed.details();
			else 
				loginChecker();
			
		} else
			System.exit(0);
	}
}
