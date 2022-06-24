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
	            
	            int pre[]=new int[n], suf[]=new int[n];
	            FillPreSuf(pre,arr,suf,n);
	            
	            int result=0;
	            for(int x=0;x<n;x++)
	            if(GCDout(x,x,pre,suf,n)>1)
	            result++;
	            
	            System.out.println(result);
	            
	        }
	    } catch(Exception e) {
	        return;
	    }
	}
	
	static int GCD(int a, int b) 
{ 
    if (b == 0) 
    return a; 
    return GCD(b, a % b); 
} 
  
static void FillPreSuf(int pre[],  int a[], int suf[], int n)  
{ 
    pre[0] = a[0]; 
    for (int i = 1; i < n; i++) 
    pre[i] = GCD(pre[i - 1], a[i]); suf[n - 1] = a[n - 1]; 
  
    for (int i = n - 2; i >= 0; i--) 
    suf[i] = GCD(suf[i + 1], a[i]); 
} 
  
static int GCDout(int i, int r, int pre[], int suf[], int n) { 
            
    if (i == 0) 
    return suf[r + 1]; 
  
    if (r == n - 1) 
    return pre[i - 1]; 
    return GCD(pre[i - 1], suf[r + 1]); 
} 
}
