import java.util.Scanner;


class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		for(int i = 1; i <= 10; i++){
		    System.out.println(n + " x " + i + " = " + n*i);
		}
	}
}
