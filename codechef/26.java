import java.util.Scanner;
public class candy {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        for(int i = 0;i<t;i++){
            int d = s.nextInt(); //chocolate have 2 bar in one packet
            int r = s.nextInt();// candy have 5 pieces in one packet

            int f = d * 2;
            int g = r* 5;

            if(f>g){
                System.out.println("chocolate");
            }else if(g>f){
                System.out.println("Candy");
            }else{
                System.out.println("Either");
            }
        }
    }
    
}
