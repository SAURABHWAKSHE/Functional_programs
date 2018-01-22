/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Distance.java
  *  Execution:    java -cp bin com.bridgelabz.util.Distance
  *  
  *  Purpose:program to find Euclidean distance
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   22-01-2018
  *
 ******************************************************************************/
package com.bridgelabz.programs;

public class Distance 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int x,y;
		double d;
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		d= Math.sqrt(x*x+y*y);
		System.out.println("Euclidean Distance = "+d+" units.");
	}

}

