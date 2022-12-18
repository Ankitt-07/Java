import java.util.Scanner;
public class scalane_traingle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            int a = sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();

            if(a==b || b==c || c==a){
                System.out.println("No");;
            }else{
                System.out.println("Yes");
            }

        }
    }
    
}
