/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =  new Scanner(System.in);
		int x = sc.nextInt();
		for(int i =0;i<x;i++){
		
		int t =sc.nextInt();
		int u =sc.nextInt();
		int v = sc.nextInt();
		
		if(t<u && t>v || t>u && t<v ){
		    System.out.println(t);
		}else if(u<v && u>t || u>v && u<t){
		    System.out.println(u);
		}else{
		    System.out.println(v);
		}
		
	
		}
	}
}
