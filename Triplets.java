/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Triplets.java
  *  Execution:    java -cp bin com.bridgelabz.util.Triplets
  *  
  *  Purpose:program to find Triplets from array
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   22-01-2018
  *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;

public class Triplets  
{
	static int n;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value Of N:");
		n = sc.nextInt();
		int i,sum=0,j,k;
		int count = 0;
		int arr[] = new int[n];
		for(i=0 ;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Distinct Triplets:");
		for(i=0 ;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				for(k=j+1 ;k<n;k++)
				{
					sum = arr[i]+arr[j]+arr[k];
					if(sum==0)
					{
						System.out.println("("+i+","+j+","+k+")");
						count++;
					}
				}
			}
		
		}
		System.out.println("Number Of Distinct Triplets:"+count);

	}

}

