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
	            int ans=-1;
	            if(n<=10)
	            ans=n;
	            else if(n%100<=(10-n/100))
	            ans=n/100+n%100;
	            System.out.println(ans);
	            
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
