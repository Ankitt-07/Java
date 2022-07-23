package while_loop;
import java.util.Scanner;

public class feh_to_celsius {
	 public static void main(String[] args)
	 {
		 Scanner a = new Scanner(System.in);
		  int start = a.nextInt();
		  int end = a.nextInt();
		  int w = a.nextInt();
		   
		   int f = start;
		    while(f <= end)
		    {
		    	int c =(int)((5.0/9)*(f-32));
		    	System.out.println(f + "\t" + c);
		    	f=f+w;
		    }
	 }

}
