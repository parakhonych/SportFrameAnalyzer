package strategy;

import dto.ImageData;
import org.opencv.core.Scalar;
import util.ImageAnalyzer;

public class ColorFieldStrategyOrange implements ColorFieldStrategy {

    @Override
    public void analyze(ImageData imageData) {
        System.out.println("Analyzing ORANGE field for image: " + imageData.getImagePath());
        System.out.println("Dominant color: "
                + imageData.getDominantColor().getColor()
                + " (" + imageData.getDominantColor().getPercentage() + "%)");

        SportStrategy strategy;

        Scalar lowerOrange = new Scalar(5, 100, 100);
        Scalar upperOrange = new Scalar(25, 255, 255);

        double avgSaturation = ImageAnalyzer.calculateAverageSaturation(
                imageData.getImage(), lowerOrange, upperOrange);

        if (avgSaturation > 150) {
            strategy = new SportStrategyTennis();
        } else {
            strategy = new SportStrategyBasketball();
        }

        double percentage = imageData.getDominantColor().getPercentage();

        if (percentage > 70) {
            strategy.lightCheck(imageData);
        } else if (percentage > 40) {
            strategy.mediumCheck(imageData);
        } else {
            strategy.heavyCheck(imageData);
        }
    }
}
