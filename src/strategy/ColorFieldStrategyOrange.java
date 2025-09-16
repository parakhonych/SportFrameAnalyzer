package strategy;

import dto.ImageData;
import org.opencv.core.Scalar;
import util.ImageAnalyzer;

public class ColorFieldStrategyOrange implements ColorFieldStrategy {

    @Override
    public String analyze(ImageData imageData) {
        SportStrategy strategy;

        double avgSaturation = ImageAnalyzer.calculateAverageSaturation(
                imageData.getImage());

        if (avgSaturation > 150) {
            strategy = new SportStrategyTennis();
        } else {
            strategy = new SportStrategyBasketball();
        }

        double percentage = imageData.getDominantColor().getPercentage();
        String resultText;

        if (percentage > 70) {
            resultText = strategy.lightResourcesAICheck(imageData);
        } else if (percentage > 40) {
            resultText = strategy.mediumResourcesAICheck(imageData);
        } else {
            resultText = strategy.heavyResourcesAICheck(imageData);
        }

        return "Field of the orange type \n" +
                resultText;
    }
}
