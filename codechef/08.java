import java.util.Scanner;
public class last_level {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i =0;i<t;i++){

            int a =s.nextInt();
            int b =s.nextInt();
            int c =s.nextInt();

            if(a<=3)
		    {
		        System.out.println(a*b);
		    }
		    else if(a%3==0)
		    {
		        System.out.println((a*b)+((a/3)-1)*c);
		    }
		    else{
		         System.out.println((a*b)+(a/3)*c);
		    }


        }

    }
    
}
