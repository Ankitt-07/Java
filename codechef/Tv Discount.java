import java.util.Scanner;
public class tv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int  a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int x = (a-c);
            int z = (b-d);
            if(x==z){
                System.out.println("Any");
            }else if(x>z){
                System.out.println("Second");

            }else{
                System.out.println("First");
            }
        }

    }
    
}
