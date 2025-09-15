package strategy;

import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import util.ImageAnalyzer;

public class OrangeColorFieldStrategy implements ColorFieldStrategy {

    @Override
    public void analyze(String color, double percentage, String imageName, Mat image) {
        System.out.println("Analyzing ORANGE field for image: " + imageName);
        System.out.println("Dominant color: " + color + " (" + percentage + "%)");
        
        Scalar lowerOrange = new Scalar(5, 100, 100);
        Scalar upperOrange = new Scalar(25, 255, 255);

        double avgSaturation = ImageAnalyzer.calculateAverageSaturation(image, lowerOrange, upperOrange);

        if (avgSaturation > 150) {
            System.out.println("Likely Tennis on clay");
        } else {
            System.out.println("Likely Basketball court");
        }
    }

}
