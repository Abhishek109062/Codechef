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
	            int temp[]=new int[n];
	            int sum=0;
	            ar[0]=temp[0]=0;
	            for(int x=1;x<n;x++){
	                
	                ar[x]=sc.nextInt();
	                sum+=ar[x];
	                temp[x]=ar[x];
	                ar[x]=sum;
	            }
	            
	            for(int x=0;x<n-1;x++){
	                int di=ar[x+1]-temp[x];
	                if(di>0)
	                temp[x+1]+=temp[x]+di;
	                else
	                temp[x+1]+=temp[x];
	            }
	            System.out.println(temp[n-1]);
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
