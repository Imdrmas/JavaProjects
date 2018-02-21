
package anonymous;

public class Anonymous {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Emp e = new Emp();
       // e.PrintName();
       
       // An With Interface
       /*
       IEmp e = new IEmp(){
         @Override
         public void PrintName(){
             System.out.println("Issam");
         }
       };
       e.PrintName(); */
       
       /*
       Emp e = new Emp(){
         @Override
         public void PrintName(){
           System.out.println("Issam");
           System.out.println("Amany");
           System.out.println("Maroo");
         }
       };
       e.PrintName();
       */
       
       
       // An With Object Without Name
       // NewJFrame f = new NewJFrame();
       // f.setVisible(true);       
       // new NewJFrame().setVisible(true);
       /*
       new Emp(){
       @Override
       public void PrintName(){
           System.out.println("An With Object Without Name :");
       }
       }.PrintName();
       */
       /*
      // Emp e = new Emp();
       MyPrint(new Emp());
       */
       
       // An As A Parameter
       /*
       Emp e = new Emp(){
         @Override
        public void PrintName(){
            System.out.println("Gehan");
        }
       };
       MyPrint(e);
       */
       
       /* AN 2
       MyPrint(new Emp(){
           @Override
           public void PrintName(){
           System.out.println("Welcome 2");
           }
       });
      */
       
    } //endding Main
    
    public static void MyPrint(Emp emp){
        emp.PrintName();
    }
}
