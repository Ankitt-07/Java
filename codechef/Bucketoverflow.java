import java.util.Scanner;
public class waterflow{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            if((w+y*z)>x){
                System.out.println("Overflow");
            }else if((w+y*z==x)){
                System.out.println("filled");
                
            }else{
                System.out.println("unfilled");
            }
        }
    }
}
