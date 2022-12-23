/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int D = sc.nextInt();
		    int T = sc.nextInt();
		    
		    int R = D*3;
		    int V = T*2;
		    
		    if(R>V){
		        System.out.println(V);
		    }else{
		        System.out.println(R);
		    }
		}
	}
}
