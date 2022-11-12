import java.util.Scanner;
public class distinct {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i =0;i<t;i++){
            int n = s.nextInt();
            int temp =0;
            for(int j =0;j<n;j++){
                int aa = s.nextInt();

                temp = Math.max(temp,aa);

            }
            System.out.println(temp);

        }

    }
    
}
