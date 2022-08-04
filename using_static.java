public class abc {
    public static class superclass {

        void print(){
                   System.out.println("print  in supper class");
                    }
           }
      
      public static class subclass extends superclass{
         void print(){
                  System.out.println("Print in subclass");
                  }
      }
      
      public static void main(String[] args){
          superclass a = new superclass ();
          superclass  b = new subclass();
      
          a.print();
          b.print();
        }
    
}
