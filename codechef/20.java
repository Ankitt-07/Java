import java.net.SocketTimeoutException;
import java.util.Scanner;
public class buger {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i =0;i<t;i++){
            int a = s.nextInt();
            int b = s.nextInt();

            if(a>=b){
                System.out.println(b);
            }else{
                System.out.println(a);
            }
        }
    }
    
}
