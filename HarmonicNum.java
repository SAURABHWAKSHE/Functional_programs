/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/HarmonicNum.java
  *  Execution:    java -cp bin com.bridgelabz.util.HarmonicNum
  *  
  *  Purpose:program to accept a num N from user and find Nth harmonic value 
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   22-01-2018
  *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;

public class HarmonicNum
{
	static int n;
	
	public static void main(String[]arg)
	{
		Scanner scv = new Scanner(System.in);
		System.out.println("Enter The Value of N:");
		n = scv.nextInt();
		int i;
		double sum=0;
		if(n>0)
		{
			for(i=1;i<=n;i++)
			{
				sum = sum + Math.pow(i,-1);
			}
		}
		System.out.println(sum);
	}
}

