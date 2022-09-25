import java.util.Scanner;
public class alice_bob {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = 2*y;
        if(x>z){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
