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
		    int participate= sc. nextInt();
		    
		    int b = participate/100;
		    int c = participate - 100*b;
		    
		    if(b+c<=10){
		        System.out.println(b+c);
		    }else{
		        System.out.println("-1");
		    }
		}
	}
}
