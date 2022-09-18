import java.util.Scanner;
public class enomurs {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int k = s.nextInt();
        int ans =0;
        for(int i = 0;i<x;i++)
        {
            int a =s.nextInt();

            if(a%k==0)
            ans++;

        }
        System.out.println( "the answer is"+ans);



    }
    
}
