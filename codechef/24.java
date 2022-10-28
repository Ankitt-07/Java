import java.util.Scanner;


public class pracrtice {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0;i<t;i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            int max =0;
            int  min =0;

            if(a>b && a>c){
                max = a;
            }else if(b>c && b>a){
                max = b;
            }else{
                max = c;

            }
            if(a<b && a<c){
                min = a;

            }else if(b<c && b<a){
                min = b;

            }else{
                min = c;
            }
            System.out.println(max - min);
            
        }
        
    }
    
}
