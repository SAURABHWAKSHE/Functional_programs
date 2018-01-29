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
