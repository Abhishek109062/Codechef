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
	            int x1=sc.nextInt();
	            int x2=sc.nextInt();
	            int y1=sc.nextInt();
	            int y2=sc.nextInt();
	            int x1x2=Math.abs(x1-x2);
	            int y1y2=Math.abs(y1-y2);
	            if((x1x2%2==0 && y1y2%2==0) || (x1x2%2!=0 && y1y2%2!=0))
	            System.out.println("YES");
	            else
	            System.out.println("NO");
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
