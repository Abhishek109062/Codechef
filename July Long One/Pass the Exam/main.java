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
	            int y=sc.nextInt();
	            int z=sc.nextInt();
	            if(x>=10 && y>=10 && z>=10 && (x+y+z)>=100)
	            System.out.println("PASS");
	            else
	            System.out.println("FAIL");
	            
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
