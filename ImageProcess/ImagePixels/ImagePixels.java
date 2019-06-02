
package ımagepixels;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author ComputerArtt
 */
public class ImagePixels {

    int width, height;
    BufferedImage image;
    
    public ImagePixels()
    {
        try {
            
            File file = new File("input.jpg");//your image path
            image = ImageIO.read(file);
            width = image.getWidth();
            height = image.getHeight();
            
            int count = 0;
            
            for(int i = 0; i < height; i++)
            {
                for(int j = 0; j < width; j++)
                {
                    count++;
                    Color c = new Color(image.getRGB(j, i));
                    System.out.println("No :" + count + " Red :" + c.getRed()
                    + " Green :"+c.getGreen()+" Blue :"+c.getBlue());
                }
            }
            
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        
        ImagePixels obj = new ImagePixels();
    }
    
}
