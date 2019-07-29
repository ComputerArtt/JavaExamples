
package canvastest;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

/**
 *
 * @author ComputerArtt
 */
class CanvasEx extends Canvas
{

    public CanvasEx() {
        setBackground(Color.BLUE);
        setBounds(100, 100, 300, 300);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.RED);
        g.fill3DRect(0, 0, 100, 100, true);
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 100, 100);
    }
    
}
public class CanvasTest extends Canvas{

    public CanvasTest() {
        Frame frame = new Frame("Canvas...");
        frame.add(new CanvasEx());
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);

    }
    
    

    public static void main(String[] args) {
        new CanvasTest();
    }
    
}
