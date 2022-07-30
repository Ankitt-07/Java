public class arry_in_reverse {
    public static void main(String[] args)
    {    int sum =0;
        int a[] = new int[6];
        

         a[0] = 3;
         a[1]=  4;
         a[2] = 5;
         a[3] = 5;
         a[4] = 4;
         System.out.print("print  array Enter element");
         
         for(int i=0;i<a.length; i++)
         {  
            System.out.println(a[i]+ " ");
         }
        System.out.println("print the reverse element of array");
        for(int i = a.length-1;i>=0.;i--)
        {
            System.out.println(a[i]);
            sum = a[i]+sum;
        }
        System.out.println("length"+a.length);
        System.out.println("addtion of the arrayv:-" +sum);
    }
    
}
