/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i = 0;i<t;i++){
		    int n = s.nextInt();
		    
		    if(n<30){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		}
	}
}
