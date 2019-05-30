
package ımagedownload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author ComputerArtt
 */
public class ImageDownload {

    public static void main(String[] args) throws MalformedURLException, IOException {
        
        String fileName = "dip.jpg";
        String website = "https://upload.wikimedia.org/wikipedia/commons/9/9c/Image-Porkeri_001.jpg";
        
        System.out.println("downloading..." + website);
        
        URL url = new URL(website);
        InputStream inputstream = url.openStream();
        OutputStream outputstream = new FileOutputStream(fileName);
        
        byte[] buffer = new byte[2048];
        int length = 0;
        
        while((length = inputstream.read(buffer)) != -1)
        {
            System.out.println("buffer read of length: " + length);
            outputstream.write(buffer, 0, length);
        }
        inputstream.close();
        outputstream.close();
    }
    
}
