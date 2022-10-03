import java.util.Scanner;
public class class1 {
    public static void  main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i=0;i<t;i++){
            int x = s.nextInt();
            int y = s.nextInt();

            int f = x*y;
            System.out.println(f);
        }
    }
    
}
