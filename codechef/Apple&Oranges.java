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
		
		int a = sc.nextInt();//cost of Appendable
		int b = sc.nextInt();//cost of orange
		
		if((a+b)>t){
		    System.out.println("No");
		    
		}else{
		    System.out.println("yes");
		}
	}
}
