
package checkboxgrouptest;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author ComputerArtt
 */
public class CheckboxGroupTest {

    public CheckboxGroupTest() 
    {
        Frame frame = new Frame("CheckboxGroup...");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.DARK_GRAY);
        frame.setExtendedState(100);
        
        Label label = new Label("label:");
        label.setAlignment(Label.CENTER);
        label.setSize(500, 100);
        label.setBackground(Color.ORANGE);
        frame.add(label);
        
        CheckboxGroup cheboxgro = new CheckboxGroup();
        
        Checkbox checkbox1 = new Checkbox("C++", cheboxgro, false);
        checkbox1.setBounds(150, 150, 30, 30);
        checkbox1.setBackground(Color.BLACK);
        frame.add(checkbox1);
        
        Checkbox checkbox2 = new Checkbox("Java", cheboxgro, false);
        checkbox2.setBounds(150, 200, 30, 30);
        checkbox2.setBackground(Color.GREEN);
        frame.add(checkbox2);
        
        checkbox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
               label.setText("C++ checkbox: checked...");
            }
        });
        
        checkbox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java checkbox: checked...");
            }
        });
    }
    
    

    public static void main(String[] args) {
        new CheckboxGroupTest();
    }
    
}
