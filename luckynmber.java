import java.util.Scanner;
public class luckynumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       int t =sc.nextInt();
       for(int i =0;i<t;i++){
        int a =sc.nextInt();
        int count=0;
		    while(a!=0){
		        int r=a%10;
		        if(r==7){
		            count++;
		        }
		        a=a/10;
		    }
		    if(count>=1){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
            }
	
       }
    }

    
}
