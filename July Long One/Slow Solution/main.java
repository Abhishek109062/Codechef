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
	             int maxT=sc.nextInt(), maxN=sc.nextInt(), sumN=sc.nextInt(),res=0;
	            while(maxT-->0 && sumN>0){
	                if(sumN>=maxN){
	                   res+=Math.pow(maxN,2);
	                   sumN-=maxN;
	                }
	                else{
	                    res+=Math.pow(sumN,2);
	                    break;
	                }
	            }
	            System.out.println(res);
	            
	            
	            
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
