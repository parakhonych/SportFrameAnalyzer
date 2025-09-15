package strategy;

import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import util.ImageAnalyzer;

public class ColorFieldStrategyOrange implements ColorFieldStrategy {

    @Override
    public void analyze(String color, double percentage, String imageName, Mat image) {
        System.out.println("Analyzing ORANGE field for image: " + imageName);
        System.out.println("Dominant color: " + color + " (" + percentage + "%)");
        SportStrategy strategy;
        Scalar lowerOrange = new Scalar(5, 100, 100);
        Scalar upperOrange = new Scalar(25, 255, 255);

        double avgSaturation = ImageAnalyzer.calculateAverageSaturation(image, lowerOrange, upperOrange);

        if (avgSaturation > 150) {
            strategy = new SportStrategyTennis();
        } else {
            strategy = new SportStrategyBasketball();
        }

        if (percentage > 70) {
            strategy.lightCheck(imageName, percentage, image);
        } else if (percentage > 40) {
            strategy.mediumCheck(imageName, percentage, image);
        } else {
            strategy.heavyCheck(imageName, percentage, image);
        }
    }

}
