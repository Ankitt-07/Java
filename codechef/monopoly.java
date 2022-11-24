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
		for(int i =0;i<t;i++){
		    int r1 = sc.nextInt();
		    int r2 = sc.nextInt();
		    int r3 = sc.nextInt();
		    
		    if(r1>r2+r3 || r2>r1+r3 || r3>r1+r2){
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}
	}
}
