package strategy;

import org.opencv.core.Mat;
import util.ImageAnalyzer;

public class ColorFieldStrategyGreen implements ColorFieldStrategy {

    @Override
    public void analyze(String color, double percentage, String imageName, Mat image) {
        System.out.println("Analyzing GREEN field for image: " + imageName);
        System.out.println("Dominant color: " + color + " (" + percentage + "%)");
        SportStrategy strategy;
        boolean hasParallelLines = ImageAnalyzer.detectParallelLines(image);
        if (hasParallelLines) {
            strategy = new SportStrategyFootball(); // American football
        } else {
            strategy = new SportStrategySoccer(); // Regular soccer
        }

        // Decide level of check based on dominant percentage
        if (percentage > 70) {
            strategy.lightCheck(imageName, percentage, image);
        } else if (percentage > 40) {
            strategy.mediumCheck(imageName, percentage, image);
        } else {
            strategy.heavyCheck(imageName, percentage, image);
        }
    }
}
