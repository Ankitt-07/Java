import java.util.Scanner;
public class Bidding {
    public static void main(String[] args){
        Scanner d  = new Scanner(System.in);
        int t = d.nextInt();
        for(int i =0;i<t;i++){
            int h= d.nextInt();//Alice
            int e =d.nextInt();//Bob
            int f = d.nextInt();//Charlie

            if(h>e && h>f ){
                System.out.println("Alice");
            }else if(e>f && e>h){
                System.out.println("Bob");
            }else {
                System.out.println("Charlie");
            }
        }

    }
    
}
