package strategy;

import org.opencv.core.Mat;

public class SportStrategyHockey implements SportStrategy {

    @Override
    public void lightCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Hockey Light Check: " + imageName + " (" + dominantPercentage + "% white)");
    }

    @Override
    public void mediumCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Hockey Medium Check: " + imageName + " (" + dominantPercentage + "% white)");
    }

    @Override
    public void heavyCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Hockey Heavy Check: " + imageName + " (" + dominantPercentage + "% white)");
    }
}