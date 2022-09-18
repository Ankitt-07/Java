import java.util.Scanner;
public class bob_bank {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i =0;i<t;i++){
            int w = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();

            int ans=(w+(x-y)*z);
            System.out.println(ans);

            

        }
        
    }
    
}
