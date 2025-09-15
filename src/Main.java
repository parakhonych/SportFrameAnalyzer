import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import factory.SportStrategyFactory;
import dto.ImageData;

public class Main {
    public static void main(String[] args) {
        System.loadLibrary(org.opencv.core.Core.NATIVE_LIBRARY_NAME);
        String imagePath = "images/image017.jpg";
        Mat image = Imgcodecs.imread(imagePath);
        if (image.empty()) {
            System.out.println("Cannot load image: " + imagePath);
            return;
        }
        ImageData imageData = new ImageData(imagePath, image);


        SportStrategyFactory factory = new SportStrategyFactory();
        factory.executeStrategy(imageData);
    }
}
