package strategy;

import org.opencv.core.Mat;

public class ColorFieldStrategyWhite implements ColorFieldStrategy {

    @Override
    public void analyze(String color, double percentage, String imageName, Mat image) {
        System.out.println("Analyzing WHITE field for image: " + imageName);
        System.out.println("Dominant color: " + color + " (" + percentage + "%)");

        SportStrategy strategy = new SportStrategyHockey();

        if (percentage > 70) {
            strategy.lightCheck(imageName, percentage, image);
        } else if (percentage > 40) {
            strategy.mediumCheck(imageName, percentage, image);
        } else {
            strategy.heavyCheck(imageName, percentage, image);
        }
    }
}
