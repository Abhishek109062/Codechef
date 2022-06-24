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
	            int k=sc.nextInt();
	            int arr[]=new int[n];
	            for(int x=0;x<n;x++)
	            arr[x]=sc.nextInt();
	            
	            int flag=1;
	            for(int x=0;x<n-1;x++){
	                if(arr[x]>arr[x+1]){
	                    if(arr[x]+arr[x+1]>k){
	                        flag=0;
	                        break;
	                    }
	                    else{
	                        int temp=arr[x];
	                        arr[x]=arr[x+1];
	                        arr[x+1]=temp;
	                    }
	                }
	            }
	            if(flag==1)
	            System.out.println("YES");
	            else
	            System.out.println("NO");
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
