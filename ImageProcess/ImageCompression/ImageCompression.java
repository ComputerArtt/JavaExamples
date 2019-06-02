
package imagecompression;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;

/**
 *
 * @author ComputerArtt
 */
public class ImageCompression {

    public static void main(String[] args) throws IOException {
        
        File file = new File("input.jpeg");
        BufferedImage img = ImageIO.read(file);
        
        File compfile = new File("inputcomp.jpg");
        OutputStream os = new FileOutputStream(compfile);
        
        Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
        ImageWriter writer = (ImageWriter)writers.next();
        
        ImageOutputStream ios = ImageIO.createImageOutputStream(os);
        writer.setOutput(ios);
        
        ImageWriteParam param = writer.getDefaultWriteParam();
        
        param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        param.setCompressionQuality(0.05f);
        writer.write(null, new IIOImage(img, null, null), param);
        
        os.close();
        ios.close();
        writer.dispose();
    }
    
}
