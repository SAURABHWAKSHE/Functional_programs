/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/WindChill.java
  *  Execution:    java -cp bin com.bridgelabz.util.WindChill
  *  
  *  Purpose:program to find Effective Temperature
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   22-01-2018
  *
 ******************************************************************************/
package com.bridgelabz.programs;

public class WindChill
{
	
    public static void main(String[] args)
    {
	    double t,v,w=0;    
    	t=Integer.parseInt(args[0]);
        v=Integer.parseInt(args[1]);
        //Effective Temperature calculation
        if(t<=50 && v>3 && v<=120)
        {
        	w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
        }
            System.out.println("Effective Temperature:"+w);	
    }
}
