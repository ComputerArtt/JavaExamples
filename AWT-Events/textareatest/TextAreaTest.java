
package textareatest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ComputerArtt
 */
public class TextAreaTest extends Frame implements ActionListener{
    Label lab1, lab2;
    TextArea txt;
    Button but;
    public TextAreaTest() 
    {
        lab1 = new Label();
        lab1.setBounds(50, 50, 100, 30);
        
        lab2 = new Label();
        lab2.setBounds(200, 50, 150, 30);
        
        txt = new TextArea();
        txt.setBounds(20, 100, 300, 300);
        
        but = new Button("Count");
        but.setBounds(250, 450, 50, 30);
        
        but.addActionListener(this);
        
        add(lab1);add(lab2);
        add(txt);add(but);
        
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String area = txt.getText();
        String words[] = area.split(" ");
        
        lab1.setText("Words: " + words.length);
        lab2.setText("Characters: " + area.length());
    }

    public static void main(String[] args) {
        new TextAreaTest();
    }

    
}
