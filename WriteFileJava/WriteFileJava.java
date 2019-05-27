
package writefilejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author ComputerArtt
 */
public class WriteFileJava {

    public static void main(String[] args) throws IOException{
     
             try {
                     File Fread = new File("read.txt");
                     File Fwrite = new File("write.txt");

                     FileInputStream fis = new FileInputStream(Fread);
                     FileOutputStream fos = new FileOutputStream(Fwrite);
                     int i;

                     while ((i = fis.read()) != -1) {
                        System.out.println(i);
                        fos.write(i);
                     }
                     fis.close();
                     fos.close();
              } catch (FileNotFoundException e) {
                     
              } catch (IOException e) {
            
              }
    }
    
}
