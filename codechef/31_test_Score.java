import java.util.Scanner;
public class test_score {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){

            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();

            if(y%z==0){
                System.out.println("No");
            }else{
                System.out.println("Yes");
            }

        }


    }
    
}
