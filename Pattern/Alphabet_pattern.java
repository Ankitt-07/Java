import java.util.Scanner;
public class aplha_pattern {
    public static void main(String[] args)
    {
        Scanner n = new Scanner(System.in);;
        int a = n.nextInt();
        int i = 1;
        while(i <= a)
        {
            int j =1;
            char ch = (char)('A' + a -i);
            while(j <= i)
            {
                System.out.print((char)(ch + j-1));
                j++;
            }
            System.out.println();
            i++;
        }

    }
    
}
