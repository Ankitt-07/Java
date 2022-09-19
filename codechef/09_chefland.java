import java.util.Scanner;
public class chefland_game {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i =0;i<t;i++){
            int r1 = s.nextInt();
            int r2 = s.nextInt();
            int r3 = s.nextInt();
            int r4 = s.nextInt();

            if(r1!=1  & r2!=1  & r3!=1 & r4!=1 ){
                
                System.out.println("IN");

            }else{
                System.out.println("OUT");
            }


        }

    }
}
