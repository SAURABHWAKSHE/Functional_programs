package com.bridgelabz.programs;
import java.util.Scanner;


public class Permutation
{
	  static void permute(char[] a, int k) 
	  {
	       if (k == a.length) 
	       {
	            for (int i = 0; i < a.length; i++) 
	            {
	                 System.out.print(a[i]);
	            }
	            System.out.println();
	       } 
	       else 
	       {
	            for (int i = k; i < a.length; i++) 
	            {
	                 char temp = a[k];
	                 a[k] = a[i];
	                 a[i] = temp;
	
	                 permute(a, k + 1);
	
	                 temp = a[k];
	                 a[k] = a[i];
	                 a[i] = temp;
	             }
	        }
	   }
	
	   public static void main(String args[]) 
	   {	
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter string: ");
		   String str = sc.next();
		   char[] sequence = str.toCharArray();

		   System.out.println("The permuted strings are: ");
		   permute(sequence, 0);

		   sc.close();
	   }
}
