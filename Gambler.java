package com.bridgelabz.programs;

import java.util.Scanner;

public class Gambler
{
	  public static double sTake,bet,goalTarget,betAmount;
	  public static double winPerc=0,lossPerc=0;
	  public static void main(String args[])
	  {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter Usr Inputs:");
		   System.out.println("Enter The Amount That You Are HAving Intially To Play:");
		   sTake = sc.nextDouble();
		   System.out.println("Enter How Many Times You Want to  bet:");
		   bet= sc.nextDouble();
		   System.out.println("Enter The Max Amount That You Want To Reach By Wining:");
		   goalTarget = sc.nextDouble();
		   System.out.println("Enter The Amount For Each bet And Win: ");
		   betAmount = sc.nextDouble();
		   betTrials(sTake,bet,goalTarget);
	  }
	  public static void betTrials(double sTake2,double bet2,double goalTarget2)
	  {
		   
		   double win = 0;
	
	        for(int i = 0;i < bet2;i++)
	        {
	        	double cash = 100;
	            while (cash > 0 && cash < goalTarget2)
	            {
	          
	                if(Math.random() > 0.5)
	                	cash = cash + betAmount;
	                else
	                	cash = cash - betAmount;
	            }
	            if(cash == goalTarget2)
	                win++;
	        }
			//PRINTING OUTPUT
	     System.out.println("he Won: " + win+" Times Out of "+bet2);
	   	 winPerc = ((win/bet2)*100);
	     System.out.println("Percentage of win is: " + winPerc);
	   	 lossPerc = (100-winPerc);
	     System.out.println("Percentage of loss is: " +lossPerc);
	   }
	}
