import java.util.Scanner;
public class c {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();
        while(t-->0){
            int  c = sc.nextInt();
            if(c<=1000){
                System.out.println("Yes");

            }else{
                System.out.println("No");
            }

        }
    }
    
}
