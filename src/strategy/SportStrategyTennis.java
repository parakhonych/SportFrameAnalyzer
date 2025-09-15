package strategy;

import org.opencv.core.Mat;

public class SportStrategyTennis implements SportStrategy {

    @Override
    public void lightCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Tennis Light Check: " + imageName + " (" + dominantPercentage + "%)");
    }

    @Override
    public void mediumCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Tennis Medium Check: " + imageName + " (" + dominantPercentage + "%)");
    }

    @Override
    public void heavyCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Tennis Heavy Check: " + imageName + " (" + dominantPercentage + "%)");
    }
}