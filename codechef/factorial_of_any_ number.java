import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int num = read.nextInt();
		int fact = 1;
		for(int a=1; a<=num; a++)
        {
            fact = fact*a;
        }
        System.out.print("The factorial of " + num + " is " + fact);
	}
}
