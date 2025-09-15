package strategy;

import dto.ImageData;

public class SportStrategyTennis implements SportStrategy {

    @Override
    public String lightResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Light",
                "Tennis",
                "Highly likely this is Tennis. \n Easy AI verification can be applied.");
    }

    @Override
    public String mediumResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Medium",
                "Tennis",
                "Likely Tennis, but some doubts remain.\n Moderate AI verification can be applied.");
    }

    @Override
    public String heavyResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Heavy",
                "Tennis",
                "Significant doubts, some indications of Tennis.\n Intensive AI verification recommended.");
    }
}
