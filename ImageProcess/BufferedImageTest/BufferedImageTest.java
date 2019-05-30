
package bufferedımagetest;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ComputerArtt
 */
public class BufferedImageTest extends JPanel{

    @Override
    public void paint(Graphics g)
    {
        Image img = createImage();
        g.drawImage(img, 50, 50, this);
    }
    private Image createImage()
    {
        BufferedImage bufferedImage = new BufferedImage(100, 
                100, BufferedImage.TYPE_INT_RGB);
        Graphics g = bufferedImage.getGraphics();
        
        System.out.println(bufferedImage.getColorModel());
        System.out.println(bufferedImage.getData());
        System.out.println(bufferedImage.getGraphics());
        System.out.println(bufferedImage.getHeight());
        System.out.println(bufferedImage.getMinX());
        System.out.println(bufferedImage.getMinY());
        System.out.println(bufferedImage.getType());
        System.out.println(bufferedImage.getRGB(50, 50));
        return bufferedImage;
    }
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.getContentPane().add(new BufferedImageTest());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        
        
    }
    
}
