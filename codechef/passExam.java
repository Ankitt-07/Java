import java.util.Scanner;
public class passexam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if(a+b+c>=100 && a>=10 &b>=10 &c>=10){
                System.out.println("pass");
            }else{
                System.out.println("Fail");
            }
        }

    }
}
