
package labeltest;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;
/**
 *
 * @author ComputerArtt
 */
public class LabelTest extends Frame implements ActionListener{
    
    TextField tf;
    Label l;
    Button b;
    public LabelTest()
    {
        super("Label Example");
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        
        tf = new TextField();
        tf.setBounds(50, 50, 100, 20);
        
        l = new Label();
        l.setBounds(50, 100, 250, 20);
        
        b = new Button("Button IP..");
        b.setBounds(50, 150, 60, 20);
        
        b.addActionListener(this);
        
        add(tf);
        add(b);
        add(l);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String host = tf.getText();
        try {
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is :  " +ip);
            
        } catch (UnknownHostException ex) {
            
        }
    }

    public static void main(String[] args) {
        LabelTest lt = new LabelTest();
    }

    
    
}
