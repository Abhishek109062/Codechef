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
	        while(t-->0){
	           int x=sc.nextInt(); 
	            if(x<=100)
	            System.out.println(x);
	            else if(x<=1000)
	            System.out.println(x-25);
	            else if(x<=5000)
	            System.out.println(x-100);
	            else
	            System.out.println(x-500);
	            
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
