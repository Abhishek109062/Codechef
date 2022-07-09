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
	            int ar[]=new int[n];
	            int smallest=Integer.MAX_VALUE;
	            int count=0;
	            for(int x=0;x<n;x++)
	            {
	                ar[x]=sc.nextInt();
	                if(ar[x]<smallest)
	                    smallest=ar[x];
	                if(ar[x]%2!=0)
	                count++;
	            
	            }
	            
	            if(smallest==1)
	            System.out.println("CHEF");
	            else if(count%2==0)
	            System.out.println("CHEFINA");
	            else
	            System.out.println("CHEF");
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
