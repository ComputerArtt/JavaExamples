
package popupmenutest;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author ComputerArtt
 */
public class PopupMenuTest {

    public PopupMenuTest() 
    {
        Frame frame = new Frame();
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.MAGENTA);
        
        Label label = new Label();
        label.setBounds(0, 0, 500, 100);
        label.setBackground(Color.GREEN);
        label.setAlignment(Label.CENTER);
        frame.add(label);
        
        PopupMenu popupmenu = new PopupMenu("Edit");
        
        MenuItem kes = new MenuItem("cut");
        kes.setActionCommand("cut");
        MenuItem kopyala = new MenuItem("copy");
        kopyala.setActionCommand("copy");
        MenuItem yapistir = new MenuItem("paste");
        yapistir.setActionCommand("paste");
        
        popupmenu.add(kes);
        popupmenu.add(kopyala);
        popupmenu.add(yapistir);
        frame.add(popupmenu); 
   
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                
                popupmenu.show(frame, e.getX(), e.getY());
                
            }
        });
        kes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(""
                        + "MenuItem clicked: " +e.getActionCommand());
            }
        });
        kopyala.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(""
                        + "MenuItem clicked: " +e.getActionCommand());
            }
        });
        yapistir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(""
                        + "MenuItem clicked: " +e.getActionCommand());
            }
        });
        
        
    }
    
    public static void main(String[] args) {

        new PopupMenuTest();
    }
    
}
