
package grayscaleconversion;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author ComputerArtt
 */
public class GrayScaleConversion {

    int width, height;
    BufferedImage image;

    public GrayScaleConversion() {
        
        try {
            File file = new File("input.jpg");//your image path
            image = ImageIO.read(file);
            width = image.getWidth();
            height = image.getHeight();
            
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    
                    Color c = new Color(image.getRGB(j, i));
                    
                    int red = (int)(c.getRed() * 0.229);
                    int green = (int)(c.getGreen() * 0.587);
                    int blue = (int)(c.getBlue() * 0.114);
                    
                    Color newc = new Color(red+green+blue, red+green+blue
                                                ,red+green+blue);
                    image.setRGB(j, i, newc.getRGB());
                }
            }
            //writing new image
            File writeimage = new File("output.jpg");
            ImageIO.write(image, "jpg", writeimage);
        } catch (Exception e) {
        }
        
    }

    public static void main(String[] args) {
        
        GrayScaleConversion GSC = new GrayScaleConversion();
    }
    
}
