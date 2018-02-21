
package mytools2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextField;


public class JTextBox extends JTextField {
     public java.awt.Color color = java.awt.Color.BLACK;
     
    public JTextBox(int size){
        super(size);
        setOpaque(false);
       
    }
    @Override
    protected void paintComponent(Graphics g){
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
        super.paintComponent(g);
    }
    @Override
    protected void paintBorder(Graphics g){
        g.setColor(Color.blue);
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
    }

    private Color getBackground(Color color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}