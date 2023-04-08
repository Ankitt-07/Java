import java.util.Scanner;
public class sum_diff {
    public static void main(String[] args){
        System.out.println("Enter the input of two number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        if(n>m){
            System.out.println("This shows that nuber is greter  " + (n-m));;;;
        }else{
            System.out.println("This shows that nuber is not  greter  " + (n+m));
        }
    }
}
