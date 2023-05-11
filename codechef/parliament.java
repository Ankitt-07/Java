import java.util.Scanner;

public class parliment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0){
         float x = sc.nextInt();
         float y =  sc.nextInt();
         float z = x/2;
         

         if(y>=z){
            System.out.println("yes");
         }else{
            System.out.println("No");
         }
        }

       
        
        
     

        


        
        
    }

}
