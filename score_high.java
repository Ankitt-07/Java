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
		    //int b =sc.nextInt();
		    
		    int b[] =  new int[4];
		    for( int i = 0; i<4;i++){
		        b[i] = sc.nextInt();
		    }
		    int max = b[0];
			for (int i = 0; i < 4; i++) {
				if (b[i] > max) {
					max = b[i];
				}
			}
			System.out.println(max);
		    
		    
		    
		    
		    
		}
	}
}
