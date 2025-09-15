package strategy;

import org.opencv.core.Mat;

public class SportStrategySoccer implements SportStrategy {
    @Override
    public void lightCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Soccer Light Check: " + imageName + " (" + dominantPercentage + "% green)");
    }

    @Override
    public void mediumCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Soccer Medium Check: " + imageName + " (" + dominantPercentage + "% green)");
    }

    @Override
    public void heavyCheck(String imageName, double dominantPercentage, Mat image) {
        System.out.println("Soccer Heavy Check: " + imageName + " (" + dominantPercentage + "% green)");
    }
}