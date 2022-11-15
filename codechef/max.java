import java.util.Scanner;
public class best_of_two {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int x = sc.nextInt();
            int z = sc.nextInt();

            System.out.println(Math.max(x,z));
        }
    }
    
}
