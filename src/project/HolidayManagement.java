package project;

import java.util.Scanner;

public class HolidayManagement {
	static Scanner sc = new Scanner(System.in);
	Sruthy s1 = new Sruthy();
	Sneha s2 = new Sneha();
	Sumit s3= new Sumit();
	void manageHoliday(String ename) {
		System.out.println("**************");
		System.out.println("Manage Holiday");
		System.out.println("**************");
		System.out.println("1.View Attendance");
		System.out.println("2.View Lop");
		System.out.println("3.Apply for the Leave");
		System.out.println("4.Leaves Left");
		System.out.println("Enter your choice(1-4):");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			if(ename.equals("sruthy"))
				s1.attendance();
			else if(ename.equals("sneha"))
				s2.attendance();
			else 
				s3.attendance();
			break;
		case 2:
			if(ename.equals("sruthy"))
				s1.lop();
			else if(ename.equals("sneha"))
				s2.lop();
			else 
				s3.lop();
			break;
		case 3:
			if(ename.equals("sruthy"))
				s1.applyLeave();
			else if(ename.equals("sneha"))
				s2.applyLeave();
			else 
				s3.applyLeave();
			break;
		case 4:
			if(ename.equals("sruthy"))
				s1.leaveBalance();
			else if(ename.equals("sneha"))
				s2.leaveBalance();
			else 
				s3.leaveBalance();
			break;
		default:
			System.out.println("Invalid Choice");
		}	
	}
}
