package strategy;

import dto.ImageData;

public class ColorFieldStrategyWhite implements ColorFieldStrategy {

    @Override
    public String analyze(ImageData imageData) {
        SportStrategy strategy = new SportStrategyHockey();

        double percentage = imageData.getDominantColor().getPercentage();

        String resultText;

        if (percentage > 70) {
            resultText = strategy.lightResourcesAICheck(imageData);
        } else if (percentage > 40) {
            resultText = strategy.mediumResourcesAICheck(imageData);
        } else {
            resultText = strategy.heavyResourcesAICheck(imageData);
        }

        return "Field of the white type \n" +
                resultText;
    }
}
