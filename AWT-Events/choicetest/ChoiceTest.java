
package choicetest;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ComputerArtt
 */
public class ChoiceTest extends Frame implements ActionListener{

    Choice choice;
    Label label;
    public ChoiceTest() 
    {
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        setBackground(Color.CYAN);

        label = new Label();
        label.setSize(500, 100);
        label.setBackground(Color.GREEN);
        label.setAlignment(Label.CENTER);
        add(label);
        
        Button button = new Button("Click");
        button.setBackground(Color.ORANGE);
        button.setBounds(100, 100, 50, 50);
        add(button);
        
        choice = new Choice();
        choice.setBounds(200, 200, 100, 100);
        choice.setBackground(Color.MAGENTA);
        choice.add("Android");
        choice.add("PHP");
        choice.add("Java");
        choice.add("Kotlin");
        choice.add("C/C++");
        add(choice);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String str = "Promming language selected: " + this.choice.getItem(this.choice.getSelectedIndex());
        label.setText(str);
    }

    public static void main(String[] args) {
        
        new ChoiceTest();
    }

    
    
}
