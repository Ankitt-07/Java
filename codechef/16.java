import java.util.Scanner;
public class rich_target {
    public static void main(String[] args){
         s = new Scanner(System.in);
        int t = s.nextInt();
        Scannerfor(int i = 0; i<t;i++){

            int a = s.nextInt();
            int b = s.nextInt();

            int c = a-b;     // so team a score 200  thens means team b needs to  win the match 201 and
                              // team b made the score 50 then to win team need 150 run to win the match
            System.out.println(c);
        }
    }
    
}
