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
		boolean islYear=false;
		if(Integer.toString(lYear).length()==4)
		{
			islYear = LeapYear(lYear);
		}
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
