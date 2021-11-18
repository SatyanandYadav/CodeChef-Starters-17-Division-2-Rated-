/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     try {
	        
	    
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
		while(t-->0)
		{
		 int a=sc.nextInt();   
		 int b=sc.nextInt();   
		 int c=sc.nextInt();   
		 int d=sc.nextInt(); 
		 if(a==c&&b==d)
		 System.out.println("0");
		 else if((a+b)%2==(c+d)%2)
		 System.out.println("2");
		 else
		 System.out.println("1");
		}
	    } catch(Exception e) {
	    } finally {
	    }	// your code goes here
	}
}
