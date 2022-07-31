import java.util.Scanner;
public class cone_pattern {
    public static void main(String[] args)

    {
        Scanner n = new Scanner(System.in);
        int  a = n.nextInt();
        int i = 1;
        while(i <= a)
        {
            int j= 1;
            while(j <= a)
            {
                System.out.print(j);
                j++;
                if(j>i)
                break;
            }
            System.out.println();
            i++;
        }

    }
    
}
