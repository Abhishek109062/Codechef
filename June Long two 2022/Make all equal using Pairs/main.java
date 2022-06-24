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
	           int arr[]=new int[n];
	           for(int x=0;x<n;x++)
	           arr[x]=sc.nextInt();
	           Arrays.sort(arr);
	           int max=0;
	           int temp=1;
	           for(int x=0;x<n-1;x++){
	               if(arr[x]==arr[x+1])
	               temp++;
	               else{
	                   max=Math.max(temp,max);
	                   temp=1;
	               }
	           }
	           max=Math.max(max,temp);
	           System.out.println(n-max);
	           }
	    } catch(Exception e) {
	        return;
	    }
	}
}
