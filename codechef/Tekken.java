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
		int t =sc.nextInt();
		while(t-->0){
		    int a= sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    
		  //  int g = Math.min(a,b);
		  //  int h = Math.min(b,c);
		  //  int j = Math.min(a,c);
		  //  if(g>h && h>j && j>g){
		  //      System.out.println("Yes");
		  //  }else{
		  //      System.out.println("No");
		    
		    
		  //  }
		  
		  if(a>Math.max(b,c)-Math.min(b,c)){
		      System.out.println("Yes");
		  }else{
		      System.out.println("No");
		  }
		}
	}
}
