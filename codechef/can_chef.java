/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0;i<t;i++){
		    int x = scan.nextInt();
		    int y = scan.nextInt();
		    
		    int z =  y*2;
		    
		    if((x*15)>=z){
		        System.out.println("yes");
		    }else{
		        System.out.println("No");
		    }
		    
		}
	}
}
