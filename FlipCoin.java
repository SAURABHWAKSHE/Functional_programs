/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/FlipCoin.java
  *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin
  *  
  *  Purpose:program to find head and tail percentage by fliping a coin n times.
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   22-01-2018
  *
 ******************************************************************************/
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

