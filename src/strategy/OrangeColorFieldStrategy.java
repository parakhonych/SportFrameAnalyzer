package strategy;

import org.opencv.core.Mat;

public class OrangeColorFieldStrategy implements ColorFieldStrategy {

    @Override
    public void analyze(String color, double percentage, String imageName, Mat image) {
        System.out.println("Analyzing ORANGE field for image: " + imageName);
        System.out.println("Dominant color: " + color + " (" + percentage + "%)");


        if (percentage > 50) {
            System.out.println("Likely Tennis on Hard Court");
        } else {
            System.out.println("Likely Basketball or other sport");
        }
    }
}
