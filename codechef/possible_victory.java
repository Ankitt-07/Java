import java.util.Scanner;
public class postive_victory {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       
            int teamA =sc.nextInt();  // r - target
            int o = sc.nextInt(); //o - over
            int teamB = sc.nextInt(); // already score
            
            int x =(20-o)*6*6;
            
            int z = teamB + x;
            if(z>teamA){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }




        

    }
    
}
