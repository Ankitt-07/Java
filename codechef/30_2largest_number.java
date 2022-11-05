import java.util.Scanner;
public class second_largest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i<t;i++){
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();

            if(x>y && x>z){
                if(y>z){
                    System.out.println(y);
                }else{
                    System.out.println(z);
                }
            }else if(y>z && y>x){
                if(z>x){
                    System.out.println(z);
                }else{
                    System.out.println(x);
                }
            }else if(z>x && z>y){
                if(x>y){
                    System.out.println(x);
                }else{
                    System.out.println(y);
                }
            }
        }


    }
    
}
