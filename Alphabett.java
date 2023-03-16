package while_loop;
import java. util.Scanner;

public class upper_case {
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		char ch = a.next().charAt(0);
		 
		if( ch >= 'A' && ch <= 'Z')
		{
			System.out.println(1);
		}
		
		else if(ch >= 'a' && ch <= 'z')
		{
			System.out.println(2);
		}
		else
		{
			System.out.println(-1);;
		
		
	}
	

}

	
}
