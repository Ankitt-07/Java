import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a  = sc.nextInt();
            int reversed = 0;
          
            while(a!=0){

                int b  = a%10;
                reversed = reversed * 10 + b;
                
                int d = a/=10;
                

            }
            

            System.out.println(reversed);
        }
    }
    
}
