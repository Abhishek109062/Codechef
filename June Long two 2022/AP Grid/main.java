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
	            int n=sc.nextInt(),m=sc.nextInt();
	            if(n>m){
	                int count=1;
	                int d=m+1;
	                for(int x=1;x<=n;x++){
	                    for(int y=1;y<=m;y++)
	                    System.out.print(count+d*(y-1)+" ");
	                    System.out.println();
	                    count++;
	                    d++;
	                }
	            }
	            else{
	                int count=1;
	                int rec=1;
	                for(int x=1;x<=n;x++){
	                    for(int y=1;y<=m;y++)
	                    System.out.print(count+rec*(y-1)+" ");
	                    System.out.println();
	                    count+=n+1;
	                    rec++;
	                }
	            }
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
