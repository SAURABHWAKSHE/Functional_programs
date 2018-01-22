/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/LeapYear.java
  *  Execution:    java -cp bin com.bridgelabz.util.LeapYear
  *  
  *  Purpose:program to accept a year from user and find whether it is leap year or not
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   22-01-2018
  *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;
public class LeapYear 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year:");
		int lYear = sc.nextInt();
		boolean islYear = LeapYear(lYear);
		System.out.println(islYear);
	}
	static boolean LeapYear(int year)
	{
		if(year%400 == 0)
			return true;
		if(year%100 == 0)
			return false;
		if(year%4 == 0)
			return true;
		return false;
		
	}
}

