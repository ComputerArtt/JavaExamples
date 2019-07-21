
package buttontest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author ComputerArtt
 */
public class ButtonTest {

    public static void main(String[] args) {
        // Button example
        
        Frame f = new Frame("Button Example...");
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        
        Button b = new Button("Button, Click me..");
        b.setBounds(100, 50, 100, 25);
        f.add(b);
        
        //button with ActionListener
        
        final TextField tf = new TextField();
        tf.setBounds(200, 50, 150, 25);
        f.add(tf);
        
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("Java Button Example with ActionListener");
            }
        });
    }
    
}
