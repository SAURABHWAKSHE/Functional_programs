
/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Quadratic.java
  *  Execution:    java -cp bin com.bridgelabz.util.Quadratic
  *  
  *  Purpose:program to find roots of quadratic equation
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   22-01-2018
  *
 ******************************************************************************/
package com.bridgelabz.programs;
import java.util.Scanner;

public class Quadratic
{
	static int a,b,c;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value For a,b and c:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		double root1,root2,delta;
		
		System.out.println("Given Eq. Is: "+a+"*x^2+"+b+"*x+"+c);
		delta = b*b-4*a*c;
		System.out.println("DElta:"+delta);
		if(delta>0)
		{
			System.out.println(" Roots are real and unequal");
			root1=(-b+Math.sqrt(delta)/2*a);
			root2=(-b-Math.sqrt(delta)/2*a);

			System.out.println(" First root is : " +root1);
			System.out.println(" Second root is : " +root2);
		}
		else if (delta==0) 
		{
			System.out.println("Roots are real and equal");
			root1=(-b+Math.sqrt(delta)/2*a);
			
			System.out.println("Root =" + root1);
		}
		else
		{
			System.out.println("Roots are Imaginary");
		}

	}

}

