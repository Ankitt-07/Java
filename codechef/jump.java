import java.util.Scanner;
public class x_jump {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        for(int i = 0;i<r;i++){
            int x = s.nextInt();
            int y = s.nextInt();

            int j = (x/y)+(x%y);
            System.out.println(j);
        }
    }
    
}
