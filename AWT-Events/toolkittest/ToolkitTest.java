
package toolkittest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ComputerArtt
 */
public class ToolkitTest extends Frame{

    public ToolkitTest() 
    {
        setSize(500,500);  
        setLayout(null);  
        setVisible(true);
        setBackground(java.awt.Color.BLACK);
        
        Button button = new Button("beep");
        button.setBackground(Color.red);
        button.setBounds(100, 100, 50, 50);
        add(button);
        
        Image img = Toolkit.getDefaultToolkit().getImage("image.jpeg");
        setIconImage(img);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Toolkit.getDefaultToolkit().beep();
            }
        });
    }
    
    

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        System.out.println("screen: " + toolkit.getScreenResolution());
        System.out.println("screen width height: "+toolkit.getScreenSize());
        System.out.println(toolkit.getColorModel());
        
        new ToolkitTest();
    }
    
}
