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
	            int n=sc.nextInt(), x=sc.nextInt(), y=sc.nextInt();
	            int ar[]=new int[n];
	            for(int i=0;i<n;i++)
	            ar[i]=sc.nextInt();
	            PriorityQueue<Integer> temp=new PriorityQueue<>();
	            for(int i:ar)
	            temp.add(i);
	            
	            while(y-->0){
	                int min=temp.peek();
	                if((min^x)>min){
	                    temp.remove();
	                    temp.add(min^x);
	                }
	                else{
	                    if(y%2==1)
	                    break;
	                    else{
	                        temp.remove();
	                        temp.add(min^x);
	                        break;
	                    }
	                }
	            }
	            for(int i=0;i<n;i++)
	            System.out.print(temp.remove()+" ");
	            System.out.println();  
	        }    
	    } catch(Exception e) {
	        return;
	    }
	}
}
