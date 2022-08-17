import java.util.Scanner;
public class Self_defence_traning {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i = 0; i<t;i++)
        {
            int n = s.nextInt();
            int c =0;
            
            for(int j = 0; j<n;j++)
            {
                int a = s.nextInt();

                if(a>=10 && a<=60){
                    c  = c+1;
                }
            }
            System.out.println(c);
        }
    }
    
}
