import java.util.Scanner;
import java.util.*;
public class prc {
    public static void main(String[] args){
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         long arr[] = new long[n];
         for(int i=0 ; i<n ;i++)
         {
               arr[i]=sc.nextInt();
         }
          Arrays.sort(arr);
             for(int i=0 ; i<n ;i++)
         {
               arr[i]=arr[i]*(n-i);
         }
          Arrays.sort(arr);
         System.out.println(arr[n-1]);
     
    }
    
}
