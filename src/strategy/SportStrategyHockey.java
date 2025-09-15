package strategy;

import dto.ImageData;

public class SportStrategyHockey implements SportStrategy {

    @Override
    public String lightResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Light",
                "Hockey",
                "Highly likely this is Hockey. \n Easy AI verification can be applied.");
    }

    @Override
    public String mediumResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Medium",
                "Hockey",
                "Likely Hockey, but some doubts remain.\n Moderate AI verification can be applied.");
    }

    @Override
    public String heavyResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Heavy",
                "Hockey",
                "Significant doubts, some indications of Hockey.\n Intensive AI verification recommended.");
    }
}
