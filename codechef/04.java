import java.util.Scanner;
public class mahasena {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int even =0,odd =0;
         int a[] = new int[n];
        for(int i = 0;i<n;i++)
        {
             a[i] = s.nextInt();
            if(a[i]%2==0 ){
                 even++;
            }else{
                odd++;


            }
                
        }
        if(even>odd){
            System.out.println("READY FOR BATTALE");
        }else{
            System.out.println("NOT READY");
        }
        
    }
    
}
