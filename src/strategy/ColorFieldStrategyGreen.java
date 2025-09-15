package strategy;

import dto.ImageData;
import util.ImageAnalyzer;

public class ColorFieldStrategyGreen implements ColorFieldStrategy {

    @Override
    public void analyze(ImageData imageData) {
        System.out.println("Analyzing GREEN field for image: " + imageData.getImageName());
        System.out.println("Dominant color: " + imageData.getDominantColor().getColor() +
                " (" + imageData.getDominantColor().getPercentage() + "%)");

        SportStrategy strategy;
        boolean hasParallelLines = ImageAnalyzer.detectParallelLines(imageData.getImage());
        if (hasParallelLines) {
            strategy = new SportStrategyFootball();
        } else {
            strategy = new SportStrategySoccer();
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
