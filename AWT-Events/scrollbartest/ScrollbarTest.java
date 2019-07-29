
package scrollbartest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 *
 * @author ComputerArtt
 */
public class ScrollbarTest {

    ScrollbarTest()
    {
        Frame frame = new Frame("Scroolbar...");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setBackground(Color.yellow);
        frame.setVisible(true);
        frame.setExtendedState(100);
        frame.setForeground(Color.red);
        
        Label label = new Label();
        label.setAlignment(label.CENTER);
        label.setBackground(Color.BLUE);
        label.setSize(430, 100);
        frame.add(label);
        
        final Scrollbar scrollbar = new Scrollbar();
        //scrollbar.setBackground(Color.LIGHT_GRAY);
        scrollbar.setBounds(430, 0, 70, 500);
        frame.add(scrollbar);
        
        scrollbar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Scrollbar value is: " +
                        scrollbar.getValue());
            }
        });
    }
    
    public static void main(String[] args) {
        new ScrollbarTest();
    }
    
}
