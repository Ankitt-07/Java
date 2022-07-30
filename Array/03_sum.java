public class array_sum {
    public static void main(String[]args)

    {
        int ar[] = new int []{1,3,4,5,8,2};
        int sum = 0;

        for(int i =0;i<ar.length;i++)
        {
            sum = sum += ar[i];
        }
        System.out.println("Array of sum"+ sum);
    }
    
}
