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
		    int a =sc.nextInt();
		    int b = sc.nextInt();
		    
		    
		    int c =  b-a;
		    if(a<b){
		        if(c%8==0){
		            System.out.println(c/8);
		        }else{
		            System.out.println((c/8)+1);
		        }
		    }else{
		        System.out.println("0");
		    }
		        
		    
		    
		    
		}
	}
}
