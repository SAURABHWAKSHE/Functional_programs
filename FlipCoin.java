package com.bridgelabz.programs;
import java.util.Scanner;

public class FlipCoin 
{
	static int nTime,nHead,nTail;
	
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to flip a coin that number times:");
		nTime = sc.nextInt();
		int i;
		
		for(i=0;i<nTime;i++)
		{
			if(Math.random()>0.5)
				nHead++;
			else
				nTail++;
		}

		System.out.println("Head Percentage:"+(nHead*100)/nTime);
		System.out.println("Tail Percentage:"+(nTail*100)/nTime);
	}
}
