package strategy;

import org.opencv.core.Mat;

// Base interface
public interface SportStrategy {
    void lightCheck(String imageName, double dominantPercentage, Mat image);

    void mediumCheck(String imageName, double dominantPercentage, Mat image);

    void heavyCheck(String imageName, double dominantPercentage, Mat image);
}