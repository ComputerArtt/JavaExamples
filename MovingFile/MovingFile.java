
package movingfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author ComputerArtt
 */
public class MovingFile {

    public static void main(String[] args) throws IOException {
        Path temp = Files.move
        (Paths.get("C:\\Users\\Computer\\Desktop\\deneme.txt"),
                Paths.get("D:\\NetBeansProjects\\MovingFile\\test.txt"));
        if(temp != null)
            System.out.println("success...");
        else
            System.out.println("failed...");
    }
    
}
