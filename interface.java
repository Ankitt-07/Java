// import java.util.Scanner;
// public class interfce {
//     public static void main(String[] args) {
        
//         Ankit s = new Ankit();
//         s.input();
//         s.output();

//     }
    
// }
// interface client{
//     void input();
//     void output();
// }
// class Ankit implements client{

//     String name; double salary;
//     public void input(){

//     Scanner s = new Scanner(System.in);
//     System.out.println("Enter the user name");
//     name =s.nextLine();

//     System.out.println("Enter the salary");
//     salary = s.nextDouble();


//     }
//     public void output(){
//         System.out.println(name+" salary is:-"+salary);

//     }
      
    
    

// }


interface customerAnkit
{
       int amt =10;
       void purchase();
}
class sellerambika implements customerAnkit
{
    @override
    public void purchase()
 {
   System.out.println("Raj need"+amt+"kg of rice");
 }
}

class check
{
   public static void main(String[]args)
 {
   customerAnkit a = new sellerambika();
    a.purchase();
    system.out.println(customeraAnkit.amt);
 }
}
