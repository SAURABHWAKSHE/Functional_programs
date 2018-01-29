package com.bridgelabz.programs;
import java.util.Scanner;

public class StringTemplate 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String:");
		String s = sc.next();
		if(s.length()>3)
		System.out.println("Hello "+s+",How are you?");
		else
			System.out.println("Username must have atleast 3 characters.");

	}

}
