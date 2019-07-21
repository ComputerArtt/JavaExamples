
package buttonUI;

import java.awt.*;

/**
 *
 * @author ComputerArtt
 */
public class UI extends Frame{
    
    public UI()
    {
        Button b = new Button("click");
        b.setBounds(30, 50, 50, 30);//position of button
        add(b);//add button into frame
        setSize(150,150);//frame size
        setLayout(null);
        setVisible(true);//frame will be visible, by default not visible
    }

    public static void main(String[] args) {
        new UI();
    }
    
}
