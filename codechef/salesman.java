import java.util.Scanner;
public class sale{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int a = s.nextInt();
            
            if(a<=100){
                System.out.println(a);
            }else if(a<=1000){
                int i = (a-25);
                System.out.println(i);
                
            }else if(a<=5000){
                int o = (a-100);
                System.out.println(o);

            }else if(a>5000){
                int z = (a-500);
                System.out.println(z);
            }
        }
    }
}

