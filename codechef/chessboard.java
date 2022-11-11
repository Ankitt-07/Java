import java.util.Scanner;
public class cheesboard {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int x  = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            int g = s.nextInt();
            int c = Math.abs(x-z);
            int v = Math.abs(y-g);
            int max = Math.max(c ,v);
            
            System.out.println(max);

        }

    }
    
}
