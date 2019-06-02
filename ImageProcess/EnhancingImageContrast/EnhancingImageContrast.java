
package enhancingımagecontrast;

import org.opencv.core.Core; 
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs; 
import org.opencv.imgproc.Imgproc; 
/**
 *
 * @author ComputerArtt
 */
public class EnhancingImageContrast {

    static int width, height;
    static double alpha = 2;
    static double beta = 50;
    
    public static void main(String[] args) {
        
        try {
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
            
            Mat src = Imgcodecs.imread("input.jpeg",Imgcodecs.IMREAD_GRAYSCALE );
            
            Mat dest = new Mat(src.rows(), src.cols(), src.type());
            Imgproc.equalizeHist(src, dest);
            
            Imgcodecs.imwrite("output.jpg", dest);

        } catch (Exception e) {
        }
    }
    
}
