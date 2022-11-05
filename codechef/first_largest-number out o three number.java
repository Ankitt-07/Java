import java.util.Scanner;
public class second_largest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i<t;i++){
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
           if(x>y &&  x>z){
            System.out.println(x);
        }else if(y>z && y>x){
            System.out.println(y);
        }else if(z>y && z>x){
            System.out.println(z);

        }
    
     }
        

    }
    
}
