package com.bridgelabz.programs;
import java.util.Scanner;

public class PrimeFactor 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num,i;
		num = sc.nextInt();
		System.out.println("Prime Factors Are:");
		for(i=2;i<=num;i++)
		{
			if(num%i == 0)
			{
				if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0)
					System.out.println(i);
				else if(i == 2 || i == 3 || i == 5 || i==7)
					System.out.println(i);
				else
					continue;
			}
		}

	}

}
