
import java.awt.AWTException;
import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MyClass {
    public static void msgBox(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    public static void CreateFolder(String folderName){
        File f = new File(folderName);
        f.mkdir();
    }
    
    public static void OpenForm(JFrame form){
        try {
            form.setLocationRelativeTo(null);
            Image img = ImageIO.read(MyClass.class.getResource("calc.png"));
            form.setIconImage(img);
            form.setDefaultCloseOperation(1);
            form.setVisible(true);
        }   catch (IOException ex) {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }     
    } // end Open Form
    
    public static void clearText(Container form){
        for(Component c : form.getComponents()){
            if(c instanceof JTextField){
                JTextField txt = (JTextField)c;
                txt.setText("");
            } else if(c instanceof Container){
              clearText((Container)c);  
            }
        }
        
    } // end Clear Text
    
    public static void creatEmptyFile(String fileName){
        try {
            File f = new File(fileName);
            f.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    } // end Create EmptyFile
    public static void creatFile(String fileName, Object data[]){
        try {
            PrintWriter p = new PrintWriter(fileName);
            for(Object obj : data){
                p.println(obj);
            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    } // end Creat File 
    
    public static Object InputBox(String title){
        Object myObj = JOptionPane.showInputDialog(title);
        return myObj;
    } // end Input Box


        public static String getNumber(String text){
        String val = "";
        for(char c : text.toCharArray()){
         if (c == '0' || c == '1' ||  c == '2' || c == '3' || c == '4' || c == '5'
                    || c == '6' || c == '7' || c == '8' || c == '9'){
             val += c;
         }
         
        } 
        return val;
} // end getnumber
        
 public static int getNumberToIntger(String text){
        String val = "";
        for(char c : text.toString().toCharArray()){
         if (c == '0' || c == '1' ||  c == '2' || c == '3' || c == '4' || c == '5'
                    || c == '6' || c == '7' || c == '8' || c == '9'){
             val += c;
         }
         
        } 
        return Integer.parseInt(val);
} // end getnumber
    
    public static void printScreen(String Imagename){
        try {
            Robot r = new Robot();
            Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage img = r.createScreenCapture(rec);
            ImageIO.write(img, "jpg", new File(Imagename + ".jpg"));
        } catch (Exception ex) {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
} // endding