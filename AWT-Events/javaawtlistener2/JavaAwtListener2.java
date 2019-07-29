
package javaawtlistener2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author ComputerArtt
 */
public class JavaAwtListener2 extends Frame implements MouseMotionListener{
 
    Label label = new Label();
            
    public JavaAwtListener2() {
        addMouseMotionListener(this);
        
        setBackground(Color.yellow);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        
        label.setBackground(Color.red);
        label.setBounds(10, 550, 100, 25);
        add(label);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
                {
                    dispose();
                }
        });
    }
     @Override
    public void mouseDragged(MouseEvent e) {
        label.setBackground(Color.ORANGE);
        Graphics grap = getGraphics();
        grap.setColor(Color.BLUE);
        grap.fillOval(e.getX(), e.getY(), 50, 2);
        label.setText("X: " + e.getX() + "  Y: " + e.getY());
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        label.setBackground(Color.DARK_GRAY);
        label.setText("X: " + e.getX() + "  Y: " + e.getY());
    }
    
    public static void main(String[] args) {
        new JavaAwtListener2();
    }   
 
}
