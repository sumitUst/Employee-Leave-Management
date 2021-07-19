package project;

import java.util.Scanner;

public class Sneha implements Employee{
	static int cl=6,pl=6,sl=6,lop=1, leaveTaken=2;
	static int leaveLeft=(cl+pl+sl)- leaveTaken;
	static Scanner sc= new Scanner(System.in);
	@Override
	public void attendance()
	{
		System.out.println("Total Working Day="+365);
		System.out.println("Leave Taken="+leaveTaken);
	}
	 
	@Override
	public void lop()
	{
		System.out.println("You have Loss of Payment for "+lop+" days");
	}
	
	@Override
	public void applyLeave()
	{
		if (leaveLeft <= 0)
		{
			System.out.println("Leave Left="+leaveLeft);
			System.out.println("Leave Denied");
		}
		else
		{
			System.out.println("Enter the no of days:");
			leaveTaken=leaveTaken+sc.nextInt();
			System.out.println("Leave Granted");
			leaveLeft=(cl+pl+sl)-leaveTaken;
			System.out.println("Leave Left="+leaveLeft);
		}
	}
	
	@Override
	public void leaveBalance()
	{
		System.out.println("Leave Left:"+leaveLeft);
	}
}
