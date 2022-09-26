import java.util.Scanner;
public class code {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i =0;i<t;i++){
            int a = s.nextInt();
            int b = s.nextInt();

            int c = a-b;
             if(c<b){
            System.out.println(c);
             }else{
            System.out.println(b);
            }
        }
        
        
    
    }

    
}
