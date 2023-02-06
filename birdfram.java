import java.util.Scanner;
public class birdfram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c =sc.nextInt();
		    
		    
		    if(c%a==0 && c%b==0){
		        System.out.println("ANY");
		    }else if(c%a==0){
		        System.out.println("CHICKEN");
		    }else if(c%b==0){
                System.out.println("DUCK");
            }else{
                System.out.println("NONE");
            }
		    
		    
		}
		
		

    }
    
}
