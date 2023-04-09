import java.rmi.StubNotFoundException;
import java.util.Scanner;
public class credit_score {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        if(t>=750){
            System.out.println("YES");
        }else{
            System.out.println("NO");;
        }

    }
    
}
