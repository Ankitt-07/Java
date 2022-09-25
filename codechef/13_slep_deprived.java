import java.util.Scanner;
public class sleep_dervied {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i = 0; i<t;i++){
            
            int x = s.nextInt();
            if(x<7){
                System.out.println("YES");// if the vlaue is less then 7 then the person slept deprived
                                             // either the person not slept deprived
            }else{
                System.out.println("NO");
            }

        }


    }
}
