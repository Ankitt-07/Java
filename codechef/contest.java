import java.util.Scanner;
public class contest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-->0){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int o = sc.nextInt();

            int p = (m-n);
            //System.out.println(p+" "+(p-o));
            System.out.println(p);
            int k = p-o;
            System.out.println(k);

        }
    }

    
}
