
package listtest;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.List;

/**
 *
 * @author ComputerArtt
 */
public class ListTest extends Frame implements ActionListener{

    Label label = new Label();
    Button button = new Button("click...");
    List list1 = new List(5,false);
    List list2 = new List(5,true);
    
    public ListTest()
    {
        super("List...");
        setBackground(Color.yellow);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
        
        label.setAlignment(Label.CENTER);
        label.setSize(500, 100);
        label.setBackground(Color.CYAN);
        add(label);
        
        button.setBounds(100, 100, 50, 50);
        button.setBackground(Color.BLUE);
        add(button);     
        
        list1.setBounds(150, 100, 50, 50);
        list1.setBackground(Color.LIGHT_GRAY);
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        add(list1);
        
        list2.setBounds(200, 100, 50, 50);
        list2.setBackground(Color.PINK);
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        add(list2);
        
        button.addActionListener(this);  
    }
    @Override
        public void actionPerformed(ActionEvent e) {
            String str = "number selected: " +list1.getItem(list1.getSelectedIndex());
            str = str + " , abc selected: ";
            
            for(String f: list2.getSelectedItems())
            {
                str = str + f + " ";
            }
            label.setText(str);
        }
    

    public static void main(String[] args) {
        
        new ListTest();
    }

    
}
