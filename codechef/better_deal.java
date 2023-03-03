/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		  //  int c =(100/a)*100;
		  //  int d = (200/b)*100;
		  
           int c= 100-(a*(100/100));
           int d= 200-(b*(200/100));
		    
		    if(c<d){
		        System.out.println("First");
		    }else if(d<c){
		        
		        System.out.println("second");
		    }else{
		        System.out.println("BOTH");
		    }
		    
		}
	}
}
