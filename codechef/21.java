import java.util.Scanner;
public class specillity {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		int t = s.nextInt();
	    for(int i = 0; i<t;i++){
	        int n = s.nextInt();
	        int m = s.nextInt();
	        int o = s.nextInt();
	        
	        if(n>m && n>o){
	            System.out.println("Setter");
	        }else if(m>o && m>n){
	            System.out.println("Tester");
	        }else  {
	            System.out.println("Editorialist");
	        }
        }
	    

    }
    
}
