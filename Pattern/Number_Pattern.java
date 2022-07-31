import java.util.Scanner;
public class simple_pattern {
    public static void main(String[]arga)
    
    {
      Scanner a = new Scanner (System.in);
      int n = a.nextInt();
      int i = 1;
      while (i <= n)
      {
        int j = 1;
        while(j<= i)
        {
            System.out.print(j);
            j = j+1;
        }
        System.out.println();
        i++;
      }
    }
    
}
