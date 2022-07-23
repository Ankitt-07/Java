public class inheritance {
    public static void main(String[] args)
    {
       sing b = new sing();
       b.walk();
       b.fly();
       b.sin();
    }
    
}
class Animal{
    void walk(){
        System.out.println("I am Walking");
    }
}
class Birds extends Animal{
    void fly(){
        System.out.println("I am Fltying");
    }
}
 class sing extends Birds{
    void sin(){
        System.out. println("I am Singing");
    }
 }
