
package javaıo;
import java.io.File;
/**
 *
 * @author ComputerArtt
 */
public class JavaIO {

    public static void main(String[] args) {

        File name = new File("test.txt");
        
        System.out.println(name.getName());
        System.out.println(name.getPath());
        System.out.println(name.getAbsolutePath());
        System.out.println(name.getParent());
        System.out.println(name.exists());
        
        if(name.exists())
        {
            System.out.println(name.canWrite());
            System.out.println(name.canRead());
            System.out.println(name.isDirectory());
            System.out.println(name.length());
            System.out.println(name.canExecute());
            System.out.println(name.getTotalSpace());
            System.out.println(name.isHidden());
        }
    }
    
}
