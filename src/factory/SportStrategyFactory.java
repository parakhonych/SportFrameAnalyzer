package factory;

import dto.ImageData;
import strategy.ColorFieldStrategy;
import strategy.ColorFieldStrategyGreen;
import strategy.ColorFieldStrategyWhite;
import strategy.ColorFieldStrategyOrange;
import dto.DominantColor;
import util.ImageAnalyzer;

public class SportStrategyFactory {

    public void executeStrategy(ImageData imageData) {
        DominantColor dominantColor = ImageAnalyzer.getDominantColor(imageData.getImage());
        imageData.setDominantColor(dominantColor);

        System.out.println("Dominant color: " + dominantColor.getColor() +
                " (" + dominantColor.getPercentage() + "%)");

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

        strategy.analyze(imageData);
    }
}
