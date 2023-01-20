/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int c = a*b;
		    int d = c/4;
		    if(c%4==0){
		        System.out.println(d);
		    }else{
		        System.out.println(d+1);
		    }
		    
		    
		    
		    
		    
		    
		}
	}
}
