import java.util.Scanner;
public class binarary {
    public static void main(String[] args)
    {
         Scanner s = new Scanner(System.in);
         int t = s.nextInt();
         for(int i = 0;i<t;i++){
            int x = s.nextInt();

            if(x<67 || x>45000){
		        System.out.println("No");
		    }else{
		        System.out.println("Yes");
		    }

         }
         
    }
    
}
