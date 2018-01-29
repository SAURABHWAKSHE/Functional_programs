package com.bridgelabz.programs;
import java.util.Scanner;

public class CouponNumber 
{
	static int nNum;
	static int[] dDistinct ;
	static double [] randNum ;
	static int size;
	static int random;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How Many Coupon Numbers You Want To Generate: ");
		nNum = sc.nextInt();
		randInt();	
	}

	public static boolean contains(int[] arr, int item)
	{
		for (int n : arr)
		{
			if (item == n) 
			{
				return true;
			}
		}
		return false;
	}     

	public static void randInt()
	{
		size = 1;
		int i,count=0,distinct=0,j=0;
		/*
		 * Array Declaration to Store Distinct Numbers and Random Numbers 
		 */
		dDistinct = new int [nNum];
		//randNum = new double [nNum*2];



		for(i= 0;i<nNum*2;i++)
		{
			random  = (int) Math.random() * 100 + 5;
			if(contains(dDistinct,random))
			{
				//size++;
				count++;
				continue;
				//randInt();
			}
			else
			{
				dDistinct[j] = random;
				distinct++;
				count++;
			}
			//randNum[i] = random;
			
			if(distinct == nNum)
			{
				System.out.println("Distinct Coupon Numbers.");
				for(i= 0;i<nNum;i++)
				{
					System.out.print(dDistinct[i]+" ");
				}
				System.out.println();
				System.out.println("total random number needed to have "+nNum+" distinct Coupon numbers = "+count++);
				break;
			}
			
			//size++;
		}

     }
}


