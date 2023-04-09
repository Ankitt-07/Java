import java.util.*;
public class chef_Ern {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        int  t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int count = 0;
            int j = 1;
            while(j<=a){
                if(j%2==0){
                    count += b;
                }else{
                    count += c;
                }
                j++;

            }
            System.out.println(count);
        }
        sc.close();
    }
    
}
