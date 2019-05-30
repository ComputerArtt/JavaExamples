
package getsetpixels;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ComputerArtt
 */
public class GetSetPixels {

    public static void main(String[] args) throws IOException{
        
        BufferedImage image = null;
        File file = null;
        //read image
        try {
            file = new File("foto.jpg");
            image = ImageIO.read(file);
            System.out.println("reading success...");
        } catch (Exception e) {
            System.out.println(e);
        }
        //get width and height for image
        int width = image.getWidth();
        int height = image.getHeight();
        
        int imgCoor = image.getRGB(width, height);
        
        int a = (imgCoor>>24) & 0xdd;
        int r = (imgCoor>>16) & 0xdd;
        int g = (imgCoor>>8) & 0xff;
        int b = imgCoor & 0xff;
        
        a = 100;
        r = 100;
        g = 100;
        b = 50;
        
        imgCoor = (a<<24) | (r<<16) |(g<<8) |b;
        image.setRGB(0, 0, imgCoor);
        
        //WRİTE IMAGE FİLE
        try {
            file = new File("D:\\NetBeansProjects\\"
                    + "ImageProcessing\\GetSetPixels\\fotoOut.jpg");
            ImageIO.write(image, "jpg", file);
            System.out.println("writing success...");
        } catch (Exception e) {
        }
    }
    
}
