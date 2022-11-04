import java.util.Scanner;
public class chess_time {
    public static void main(String[] args)

    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i<t;i++){


            int g = s.nextInt();
            int f  = ((g*60)/20);
            System.out.println(f);
        }

    }
    
}
