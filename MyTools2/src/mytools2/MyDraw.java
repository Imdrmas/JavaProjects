
package mytools2;

import java.awt.BasicStroke;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import javafx.scene.paint.Color;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyDraw {
    private final JFrame form;
    private final int wForm;
    private final int hForm;
    
    public MyDraw(JFrame form){
        this.form = form;
        wForm = form.getWidth();
        hForm = form.getHeight();
    }
    
    public int border = 1;
    public Color color = Color.RED;
    
    public void DrawLine(int x1, int x2, int y1, int y2){
        JPanel pnl;
        pnl = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)(Graphics)g;
                g2.setColor(java.awt.Color.blue);
                g2.setStroke(new BasicStroke(border));
                g2.drawLine(x1, y1, x2, y2);
                
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wForm, hForm);
    } // end DrawLine
    
    public void DrawRect(int x, int y, int width, int height){
        JPanel pnl = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(java.awt.Color.blue);
                g2.setStroke(new BasicStroke(border));
                g2.drawRect(x, y, width, height);
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wForm, hForm);
    } // end DrawRect
    
    public void DrawOval(int x, int y, int width, int height){
        JPanel pnl = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
               Graphics2D g2 = (Graphics2D)g; 
               g2.setColor(java.awt.Color.black);
               g2.setStroke(new BasicStroke(border));
               g2.drawOval(x, y, width, height);
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wForm, hForm);
    } // End DrawOval
    
    public void DrawPolygon(int xPoints[], int yPoints[], int nPoints){
        JPanel pnl = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(java.awt.Color.red);
                g2.setStroke(new BasicStroke(border));
                g2.drawPolygon(xPoints, yPoints, nPoints);
            }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wForm, hForm);
    } // end DrawPolynog
    
    public void DrawString(int x, int y, String text, String FontName,int FontSize){
        JPanel pnl;
        pnl = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                g2.setColor(java.awt.Color.blue);
                Font font = new Font(FontName, Font.BOLD, FontSize);
                g2.setFont(font);
                g2.drawString(text, x, y);
                        
        }
            
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wForm, hForm);
    } // end Sraw String
    
    public void DrawImage(int x, int y, String path){
        JPanel pnl;
        pnl = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                Graphics2D g2 = (Graphics2D)g;
                File imgFile = new File(path);
                
                try {
                 Image img = ImageIO.read(imgFile);
                 g2.drawImage(img, x, y, form);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog( null, ex.getMessage());
                }
                
         }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wForm, hForm);
    } // end Draw Image
    
    public void DrawRoundRect(int x, int y, int width, int height, int borderRaduis){
        JPanel pnl = new JPanel(){
           @Override 
           public void paintComponent(Graphics g){
               Graphics2D g2 = (Graphics2D)g;
               g2.setColor(java.awt.Color.red);
               g2.setStroke(new BasicStroke(border));
               g2.drawRoundRect(x, y, width, height, borderRaduis, borderRaduis);
           }
        };
        form.add(pnl);
        pnl.setBounds(0, 0, wForm, hForm);
        
    }
    
    
} //endding
