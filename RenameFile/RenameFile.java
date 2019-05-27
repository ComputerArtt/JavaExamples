
package renamefile;

import java.io.File;

/**
 *
 * @author ComputerArtt
 */
public class RenameFile {

    public static void main(String[] args) {
        File name = new File("test.txt");
        File newname = new File("newtest.txt");
        
        if(name.renameTo(newname))
            System.out.println("success...");
        else
            System.out.println("failed...");
                    //delet a file
        try {
            Thread.sleep(50*10*10);
        } catch (InterruptedException ex) {
            
        }
        if(newname.delete())
            System.out.println("deleted...");
        else
            System.out.println("failed to delete...");
        
    }
    
}
