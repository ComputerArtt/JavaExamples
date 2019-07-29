
package javaawtlistener;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author ComputerArtt
 */
public abstract  class JavaAwtListener implements MouseListener{

    public static void main(String[] args) {
        
        Frame frame = new Frame("Listeners");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.CYAN);
        
        TextField textfield = new TextField();
        textfield.setBounds(100, 100, 300,50);
        frame.add(textfield);
        
        Button button = new Button("Click..");
        button.setBackground(Color.red);
        button.setBounds(150, 150, 50, 50);
        frame.add(button);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textfield.setText("--JAVA CORE--");
            }
        });
        textfield.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textfield.setBackground(Color.BLACK);
                textfield.setText("clicked...");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                textfield.setBackground(Color.CYAN);
                textfield.setText("pressed...");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                textfield.setBackground(Color.DARK_GRAY);
                textfield.setText("released.");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                textfield.setBackground(Color.ORANGE);
                textfield.setText("entered.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                textfield.setBackground(Color.GREEN);
                textfield.setText("exited.");
            }
        } );
    }

}
