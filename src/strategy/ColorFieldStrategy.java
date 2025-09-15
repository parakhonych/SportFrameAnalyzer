package strategy;

import org.opencv.core.Mat;

public interface ColorFieldStrategy {
    void analyze(String color, double percentage, String imageName, Mat image);
}
