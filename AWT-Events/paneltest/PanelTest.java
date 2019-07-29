
package paneltest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author ComputerArtt
 */
public class PanelTest extends Frame{

    public PanelTest() 
    {
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        
        Panel panel = new Panel();
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(100, 100, 300, 100);
        add(panel);
        
        Button button = new Button("click me:)");
        button.setBackground(Color.red);
        button.setBounds(150, 150, 50, 50);
        panel.add(button);
    }

    
    
    public static void main(String[] args) {
        new PanelTest();
    }
    
}
