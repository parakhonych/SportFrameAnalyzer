package strategy;

import org.opencv.core.Mat;

public class SportStrategyBasketball implements SportStrategy {

    @Override
    public void lightCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Basketball Light Check: " + imageName + " (" + dominantPercentage + "%)");
    }

    @Override
    public void mediumCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Basketball Medium Check: " + imageName + " (" + dominantPercentage + "%)");
    }

    @Override
    public void heavyCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Basketball Heavy Check: " + imageName + " (" + dominantPercentage + "%)");
    }
}