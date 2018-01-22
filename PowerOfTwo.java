/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/PowerOfTwo.java
  *  Execution:    java -cp bin com.bridgelabz.util.PowerOfTwo
  *  
  *  Purpose:program to accept a num N from user and print the power of 2 upto N
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   22-01-2018
  *
 ******************************************************************************/
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

