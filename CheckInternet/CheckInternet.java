
package checkınternet;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author ComputerArtt
 */
public class CheckInternet {

    public static void main(String[] args) throws IOException, InterruptedException {
//        2 method to check internet
//        1) by using getRuntime() method of java Runtime class.
//        2) by using methods of java URL and URLConnection classes.
        Process pro = java.lang.Runtime.getRuntime().exec("ping www.google.com");
        int x = pro.waitFor();
        if(x==0)
            System.out.println("success: "+x);
        else
            System.out.println("failed: " + x);
        //2.method
        URL url = new URL("https://www.google.com");
        URLConnection connect = url.openConnection();
        connect.connect();
        System.out.println("success...");
        
    }
    
}
