package com.bridgelabz.programs;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray 
{
	static int mRow,nCol;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Scanner class Declaration and Accepting Array Size
		 */
		Scanner in = new Scanner(System.in);
		PrintWriter print = new PrintWriter(new OutputStreamWriter(System.out));
		print.write("Enter The Size Of The Array:");
		print.flush();
		mRow = in.nextInt();
		nCol = in.nextInt();
		int choice, i, j; 

		/*
		 * Declaration Of Array 
		 */
		int [][] intArray = new int [mRow][nCol];
		double [][] douArray = new double [mRow][nCol];
		boolean [][] bolArray = new boolean [mRow][nCol];
		print.write("Enter Your Choice of Array");
		print.flush();
		choice = in.nextInt();
		/*
		 * 
		 */
		switch(choice)
		{
			case 1 :print.write("You have opted for Integer Array.now Accept Array Elements:");
					print.flush();
					for(i=0;i<mRow;i++)
					{
						for(j=0;j<nCol;j++)
						{
							intArray[i][j] = in.nextInt();
						}
					}
					print.println("Printing Array On Std.Output:");
					print.flush();
					for(i=0;i<mRow;i++)
					{
						for(j=0;j<nCol;j++)
						{
							int el = intArray[i][j];
							print.write(String.valueOf(el)+" ");
							//System.out.println(intArray[i][j]);
							print.flush();
							
						}
						print.println();
						print.flush();
					}
					break;
			case 2 :print.write("You have opted for Double Array.now Accept Array Elements:");
			      	print.flush();
					for(i=0;i<mRow;i++)
					{
						for(j=0;j<nCol;j++)
						{
							douArray[i][j] = in.nextDouble();
						}
					}
					print.println("Printing Array On Std.Output:");
					//print.println();
					print.flush();
					for(i=0;i<mRow;i++)
					{
						for(j=0;j<nCol;j++)
						{
							print.print(douArray[i][j]+" ");
							print.flush();
							
						}
						print.println();
						print.flush();
					}
					break;
			case 3 :print.write("You have opted for boolean Array.now Accept Array Elements:");
					print.flush();
					for(i=0;i<mRow;i++)
					{
						for(j=0;j<nCol;j++)
						{
							bolArray[i][j] = in.nextBoolean();
						}
					}
					print.println("Printing Array On Std.Output:");
					print.flush();
					for(i=0;i<mRow;i++)
					{
						for(j=0;j<nCol;j++)
						{
							print.print(bolArray[i][j]+" ");
							print.flush();
							
						}
						print.println();
						print.flush();
					}
					break;
			default :print.write("Invalid Choice");
					 print.flush();
					 print.close();
		}

	}

}
