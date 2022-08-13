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
	            String s="NO";
	            for(int i=1;i*i<=x;i++){
	                if((x-2*i)%(2+i)==0 && x!=2*i)
	                {
	                    s="YES";
	                    break;
	                }
	           }
	           System.out.println(s);
	            
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
