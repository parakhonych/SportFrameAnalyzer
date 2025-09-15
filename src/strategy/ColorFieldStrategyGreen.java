package strategy;

import dto.ImageData;
import util.ImageAnalyzer;

public class ColorFieldStrategyGreen implements ColorFieldStrategy {

    @Override
    public String analyze(ImageData imageData) {
        SportStrategy strategy;
        boolean hasParallelLines = ImageAnalyzer.detectParallelLines(imageData.getImage());

        if (hasParallelLines) {
            strategy = new SportStrategyFootball();
        } else {
            strategy = new SportStrategySoccer();
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

        return "Field of the green type \n" +
                resultText;

    }
}
