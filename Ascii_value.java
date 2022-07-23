import java.util.Scanner;
public class Ascii {
    public static void main(String[] args)
    {   //char ch;
        Scanner sc=new Scanner(System.in);
        char ch =sc.next().charAt(0);

        int A = ch;

        System.out.println("Ascii value of character"+ ch + "is"+ A);
    }
    
}
