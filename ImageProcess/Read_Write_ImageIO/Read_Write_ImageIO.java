
package read_write_ımageıo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author ComputerArtt
 */
public class Read_Write_ImageIO {

    public static void main(String[] args) throws IOException{
        
        int width = 963;//width of the image
        int height = 640;//height of the image
        BufferedImage image = new BufferedImage(width, height, 
                                        BufferedImage.TYPE_INT_ARGB);
              
        try {
            File infile = new File("foto.jpg");
            /* create an object of BufferedImage type and pass 
               as parameter the width,  height and image int 
               type.TYPE_INT_ARGB means that we are representing 
               the Alpha, Red, Green and Blue component of the 
               image pixel using 8 bit integer value. */
            
            image = ImageIO.read(infile);
            System.out.println("image reading success...");
        } catch (Exception e) {
        }
        //WRITING AN IMAGE FILE
        try {
            File outfile = new File("fotoOut.jpg");
            ImageIO.write(image, "jpg", outfile);
            System.out.println("writing success...");
        } catch (Exception e) {
        }
    }
    
}
