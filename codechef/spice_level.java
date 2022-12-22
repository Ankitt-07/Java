/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int x = sc.nextInt();
		    if(x>=4 && x<7){
		        System.out.println("MEDIUM");
		    }else if(x>7){
		        System.out.println("HOT");
		    }else{
		        System.out.println("MILD");
		    }
		}
	}
}
