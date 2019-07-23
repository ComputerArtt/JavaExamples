
package checkboxtest;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author ComputerArtt
 */
public class CheckboxTest {

    public CheckboxTest() 
    {
        Frame frame = new Frame("Checkbox Test");
        
        Label label = new Label();
        label.setSize(500, 100);
        label.setBackground(Color.BLUE);
        label.setFont(new Font("Courier New",Font.ITALIC,20));
        label.setAlignment(Label.CENTER);
        frame.add(label);
        
        Checkbox check1 = new Checkbox("C++");
        check1.setBounds(100, 100, 50, 50);
        check1.setBackground(Color.RED);
        frame.add(check1);
        
        Checkbox check2 = new Checkbox("Java");
        check2.setBounds(100, 150, 50, 50);
        check2.setBackground(Color.GREEN);
        frame.add(check2);
        
        check1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("C++ Checkbox " +(e.getStateChange()==1 ? "checked" : "unchecked"));
            }
        });
        
        check2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label.setText("Java Checkbox: " + (e.getStateChange()==1?"checked":"unchecked"));
            }
        });
        
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    

    public static void main(String[] args) {
        
        new CheckboxTest();
    }
    
}
