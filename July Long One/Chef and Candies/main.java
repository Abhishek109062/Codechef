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
	            int n=sc.nextInt();
	            int x=sc.nextInt();
	            System.out.println(x>=n?0:((n-x)%4==0?(n-x)/4:(n-x)/4+1));
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
