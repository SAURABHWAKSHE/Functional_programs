package com.bridgelabz.programs;
//import java.util.Scanner;

public class PowerOfTwo 
{
	static int N;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter N:");
		N = Integer.parseInt(args[0]);
		int i;
		if(N<=31)
		{
			System.out.println("Table of Two:");
			for(i = 0;i<=N;i++)
			{
				System.out.println(Math.pow(2, i));
			}
		}
		else
		{
			System.out.println("N should be less than or equal to 31");
		}
		
		

	}

}
