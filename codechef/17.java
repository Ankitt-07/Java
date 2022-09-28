import java.util.Scanner;
public class i_d{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        if(n%4==0){
            n++;
        }else{
            n--;
        }
        System.out.println(n);
    }
}
