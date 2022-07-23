package pattern;
import java.util.Scanner;
public class reverse_pattern {
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		int s = a.nextInt();
		int i = 1;
		while( i <= s)
		{
			int j =i;
			while( j >= 1)
			{
				System.out.print(j);
				j = j-1;
			}
			
			System.out.println();
			i = i +1;
		}
	}

}
