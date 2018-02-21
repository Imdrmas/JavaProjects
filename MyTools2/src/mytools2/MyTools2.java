
package mytools2;

//import javafx.scene.paint.Color;

public class MyTools2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FRM f = new FRM();
        MyDraw d = new MyDraw(f);
        d.border = 3;
        // d.DrawLine(10, 150, 30, 150);
        // d.DrawRect(20, 50, 150, 250);
        // d.DrawOval(10, 20, 150, 150);
        /*
        int x[] = {100,170,350};
        int y[] = {200,130,300};
        d.DrawPolygon(x, y, 3);
        */
        /*
        int x[] = {100,170,170, 280, 280, 170, 170};
        int y[] = {135,80, 100, 100, 170, 170, 190};
        d.DrawPolygon(x, y, 7);
        f.setVisible(true);
        */
        /*
        d.DrawString(120, 50, "Issam Drmas", "Tahoma", 50);
        d.DrawString(120, 150, "Welcome", "Arial", 50);  
        */
        
       // d.DrawImage(30, 50, "01.jpg");
       // d.DrawImage(300, 50, "02.jpg");
       
       d.DrawRoundRect(50, 70, 150, 90, 20);
        f.setVisible(true);
    }
    
}
