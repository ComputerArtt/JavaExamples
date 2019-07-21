
package textfieldtest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ComputerArtt
 */
public class TextFieldTest extends Frame implements ActionListener{
    TextField tf1, tf2, tf3;
    Button b1, b2;
    
    public TextFieldTest()
    {
        tf1 = new TextField();
        tf1.setBounds(50, 50, 100, 20);
        
        tf2 = new TextField();
        tf2.setBounds(50, 100, 100, 20);
        
        tf3 = new TextField();
        tf3.setBounds(50, 150, 100, 20);
        
        b1 = new Button("add");
        b1.setBounds(50, 200, 50, 50);
        
        b2 = new Button("minus");
        b2.setBounds(120, 200, 50, 50);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        add(tf1);add(tf2);add(tf3);
        add(b1);add(b2);
        
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String str1 = tf1.getText();
        String str2 = tf2.getText();
        
        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);
        int z = 0;
        
        if(e.getSource() == b1)
        {
            z = x + y;
        }else if(e.getSource() == b2){
            z = x - y;
        }
        String res = String.valueOf(z);
        tf3.setText(res);
    }

    public static void main(String[] args) {
        new TextFieldTest();
    }

    
    
}
