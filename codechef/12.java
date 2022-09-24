import java.util.Scanner;
public class cup_finale {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        for(int i = 0;i<t;i++){
                                 //abs() method returns the absolute (Positive) value of a int value. This method gives the absolute value of the argument. The argument can be int, double, long and float
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            if(Math.abs(a - b)<= c)  // Math.abs
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
            

            


         
         
        

    }
    
}
