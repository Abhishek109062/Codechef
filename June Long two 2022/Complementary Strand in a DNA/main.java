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
	            String s=sc.next();
	            String ans="";
	            for(int x=0;x<n;x++){
	                if(s.charAt(x)=='A')
	                ans=ans+"T";
	                else if(s.charAt(x)=='T')
	                ans=ans+"A";
	                else if(s.charAt(x)=='C')
	                ans=ans+"G";
	                else if(s.charAt(x)=='G')
	                ans=ans+"C";
	            }
	                System.out.println(ans);
	            
	            
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
