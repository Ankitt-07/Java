import java.util.Scanner;
public class pass_or_fail {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        for(int i = 0;i<t;i++){
            int n = s.nextInt();
            int x = s.nextInt();   
            int p = s.nextInt();

         if((3*x-(n-x))>=p){
            System.out.println("PASS");

            }else{
                System.out.println("FAIL");
            }
        }
    }
    
}
