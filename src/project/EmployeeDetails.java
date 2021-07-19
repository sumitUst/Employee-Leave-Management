package project;

import java.util.Scanner;

public class EmployeeDetails {
	static String ename;
	static Scanner sc =new Scanner(System.in);
	
	//Fetch the Employee's Details
	String details()
	{
		System.out.println("Enter Employee Name");
		ename=sc.nextLine();
		System.out.println("****************");
		System.out.println("Employee Details");
		System.out.println("****************");
		switch(ename)
		{
		case "sumit":
			System.out.println("Employee ID=176541");
			System.out.println("Location=Bangalore");
			System.out.println("Designation=Software Developer II");
			return ename;
		
		case "sruthy":
			System.out.println("Employee ID=179294");
			System.out.println("Location=Trivandrum");
			System.out.println("Designation=Associate Software Developer");
			return ename;
		
		case "sneha":
			System.out.println("Employee ID=112356");
			System.out.println("Location=Hyderabad");
			System.out.println("Designation=Project Manager");
			return ename;
			
		default:
				System.out.println(ename+" is an invalid employee name");
				return ename;
					
		}
		
	}
}
