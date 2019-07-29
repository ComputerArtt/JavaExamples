
package dialogtest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ComputerArtt
 */
public class DialogTest extends Frame{

    static Dialog d;
    public DialogTest() {
        d= new Dialog(new Frame(), "Dialog Test", true);
        d.setBackground(Color.yellow);
        d.setLayout(new FlowLayout());
        
        Button button = new Button("Click me..");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DialogTest.d.setVisible(false);
            }
        });
        d.add(new Label("Click button to cont..."));
        d.add(button);
        d.setSize(250, 500);
        d.setVisible(true);
        d.setBackground(Color.CYAN);
    }

    
    public static void main(String[] args) {
        new DialogTest();
    }
    
}
