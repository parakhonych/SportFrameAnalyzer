package strategy;

import dto.ImageData;
import org.opencv.core.Mat;

public class ColorFieldStrategyWhite implements ColorFieldStrategy {

    @Override
    public void analyze(ImageData imageData) {
        System.out.println("Analyzing WHITE field for image: " + imageData.getImagePath());
        System.out.println("Dominant color: "
                + imageData.getDominantColor().getColor()
                + " (" + imageData.getDominantColor().getPercentage() + "%)");

        SportStrategy strategy = new SportStrategyHockey();

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
