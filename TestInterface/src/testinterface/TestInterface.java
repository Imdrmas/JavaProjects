
package testinterface;

//import javax.swing.JFrame;

public class TestInterface {
    
    public static void GetMethodCount(Object c){
        System.out.println(c.getClass().getDeclaredMethods().length);
    }
    
    public static void RunAdd(Calc1 c){
        System.out.println(c.Add(5, 6));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Calc c = new Calc();
        c.Add(5, 6); 
        CalcPlus c1 = new CalcPlus();
        RunAdd(c1); */
      
       /*
       JFrame frm = new JFrame("Welcome");
       frm.setSize(500, 500);
       frm.getContentPane().setBackground(MyColor.WHITE);
       frm.setVisible(true);
       */
       
       
       GetMethodCount(new Class2());
    }
    
}
