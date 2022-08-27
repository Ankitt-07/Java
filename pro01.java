public class pro{


    int sum(int a, int b){
        return a - b;

    }
    int sum (int a, int b, int c){
        return a + b +c;
    }
    public static void main(String[] args) {

        pro obj = new pro();
        obj .sum(12,12);
        obj.sum(10,2, 18);
        

        System.out.println(obj);
    }
}
