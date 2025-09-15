package strategy;

import org.opencv.core.Mat;
import util.ImageAnalyzer;

public class GreenColorFieldStrategy implements ColorFieldStrategy {

    @Override
    public void analyze(String color, double percentage, String imageName, Mat image) {
        System.out.println("Analyzing GREEN field for image: " + imageName);
        System.out.println("Dominant color: " + color + " (" + percentage + "%)");

        boolean hasParallelLines = ImageAnalyzer.detectParallelLines(image);
        if (hasParallelLines) {
            System.out.println("Likely American Football");
        } else {
            System.out.println("Likely Soccer");
        }
    }
}
