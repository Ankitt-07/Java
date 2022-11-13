import java.util.Scanner;
public class packing_book {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i =0;i<t;i++){

        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();

        if(y%z==0){
            System.out.println(y/z*x);
        }else{
            System.out.println((y/z+1)*x);
        }

     }

    }
    
}
