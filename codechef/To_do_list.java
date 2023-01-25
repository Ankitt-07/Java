import java.util.Scanner;
public class To_do_list{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int a = sc.nextInt();
            int b[] = new int[a];

            int count =0;
            for(int j =0;j<a;j++){
                b[j] =sc.nextInt();

                if(b[j]>=1000){
                    count++;

                }

            }
            System.out.println(count);
        }

          }
}
