/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =  new Scanner(System.in);
		int t  = sc.nextInt();
		while(t-->0){
		    int x  = sc.nextInt();
		    
		    if(x<7 && x>=3){
		        System.out.println("MODERATE");
		        
		    }else if(x>=7){
		        System.out.println("HEAVY");
		    }else{
		        System.out.println("LIGHT");
		    }
		}
	}
}
