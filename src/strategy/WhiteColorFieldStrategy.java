package strategy;

import org.opencv.core.Mat;

public class WhiteColorFieldStrategy implements ColorFieldStrategy {

    @Override
    public void analyze(String color, double percentage, String imageName, Mat image) {
        System.out.println("Analyzing WHITE field for image: " + imageName);
        System.out.println("Dominant color: " + color + " (" + percentage + "%)");

        if (percentage > 50) {
            System.out.println("Likely Hockey");
        } else {
            System.out.println("Uncertain, may require further analysis");
        }
    }
}
