import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.highgui.HighGui;
import factory.SportStrategyFactory;


public class Main {
    public static void main(String[] args) {
        System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
        String imagePath = "images/image011.jpg";
        Mat image = Imgcodecs.imread(imagePath);
        if (image.empty()) {
            System.out.println("Cannot load image: " + imagePath);
            return;
        }
        SportStrategyFactory factory = new SportStrategyFactory();
        factory.executeStrategy(imagePath, image);
    }
}
