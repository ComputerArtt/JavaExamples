
package enhancingımagebrightness;

import org.opencv.core.Core; 
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs; 
/**
 *
 * @author ComputerArtt
 */
public class EnhancingImageBrightness {
    static double alpha = 2;
    static double beta = 50;
    
    public static void main(String[] args) {
        
        try {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            Mat src = Imgcodecs.imread("Fall.jpeg",Imgcodecs.IMREAD_GRAYSCALE );
            Mat dest = new Mat(src.rows(), src.cols(), src.type());
            src.convertTo(dest, -1, alpha, beta);
            Imgcodecs.imwrite("output.jpeg", dest);
        } catch (Exception e) {
        }
    }
    
}
