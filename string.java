import java.util.Scanner;
public class String_01 {
    public static void main(String[] args)
    {
        
       
        Scanner b = new Scanner(System.in);
        String A = b.next();
        String B = b.next();
       System.out.println(A.length() + B.length());
       System.out.println(A.compareTo(B)>0? "yes":"No");
       System.out.println(A.substring(0,1).toUpperCase() + A.substring(1,A.length())+ " "+ B.substring(0,1).toUpperCase()+ B.substring(1,B.length()));
       
    
       

      




    } 
    
}
