package factory;

import org.opencv.core.Mat;
import strategy.ColorFieldStrategy;
import strategy.ColorFieldStrategyGreen;
import strategy.ColorFieldStrategyWhite;
import strategy.ColorFieldStrategyOrange;
import util.ImageAnalyzer;
import dto.DominantColor;

public class SportStrategyFactory {

    public static void executeStrategy(String imageName, Mat image) {

        DominantColor dominantColor = ImageAnalyzer.getDominantColor(image);
        System.out.println("Dominant color: " + dominantColor.getColor() + " (" + dominantColor.getPercentage() + "%)");

        ColorFieldStrategy strategy;

        switch (dominantColor.getColor().toLowerCase()) {
            case "green":
                strategy = new ColorFieldStrategyGreen();
                break;
            case "white":
                strategy = new ColorFieldStrategyWhite();
                break;
            case "orange":
                strategy = new ColorFieldStrategyOrange();
                break;
            default:
                throw new IllegalArgumentException("No strategy for color: " + dominantColor.getColor());
        }


        strategy.analyze(dominantColor.getColor(), dominantColor.getPercentage(), imageName, image);
    }
}
