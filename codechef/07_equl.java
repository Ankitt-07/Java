import java.util.Scanner;
public class The_three_topic {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i =0;i<a;i++){

            int A = s.nextInt();
            int B = s.nextInt();
            int C = s.nextInt();
            int D = s.nextInt();

            if(A==D||B==D||C==D){
                System.out.println("yes");
            }else{
                System.out.println("No");
            }

            
        
            
            
        }
        
    }
    
}
