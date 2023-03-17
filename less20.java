import java.util.Scanner;
public class battery {
    public static void main(String[]args){
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();

            for(int i =  0 ;i<t;i++)
            {
                int x = s.nextInt();

                if(x<=20){
                    System.out.println("yes");
                }else{
                    System.out.println("NO");
                }
            }
        }
        
    }
    
}
