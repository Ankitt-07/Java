package pattern;

import java.util.Scanner;

public class Star_one {
   public static void main(String[] args)
   {
	   Scanner a = new Scanner(System.in);
	    int s = a.nextInt();
	     
	    int  i = 1;
	    while (i <= s)
	    {
	    	int j = 1;
	    	while(j <= i)
	    	{
	    		System.out.print(" * " );
	    		j = j +1;
	    	}
	    	System.out.println();
	    	i = i +1;
	    }
   }
}
