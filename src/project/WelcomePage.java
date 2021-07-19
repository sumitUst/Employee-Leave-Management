package project;

import java.util.Scanner;

public class WelcomePage {
	static Scanner sc = new Scanner(System.in);
	int begin()
	{
		System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println("**************************");
		System.out.println("1.Continue");
		System.out.println("2.Exit");
		System.out.println("**************************");
		System.out.println("Enter Your Choice(1/2):");
		int n=sc.nextInt();
		return n;
	}
}
