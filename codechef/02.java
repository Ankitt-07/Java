import java.util.Scanner;
public class discus_throw {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i = 0; i<t;i++)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            if(a>=b & a>= c)
            {
                System.out.println(a);
            }else if (b>=a & b>=c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }


        }
    }
    
}
