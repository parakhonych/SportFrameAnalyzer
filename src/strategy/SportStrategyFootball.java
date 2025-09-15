package strategy;

import org.opencv.core.Mat;

public class SportStrategyFootball implements SportStrategy {
    @Override
    public void lightCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Football Light Check: " + imageName + " (" + dominantPercentage + "% green)");
    }

    @Override
    public void mediumCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Football Medium Check: " + imageName + " (" + dominantPercentage + "% green)");
    }

    @Override
    public void heavyCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Football Heavy Check: " + imageName + " (" + dominantPercentage + "% green)");
    }
}
