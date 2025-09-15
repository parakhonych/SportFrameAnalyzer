package strategy;

import dto.ImageData;

public class SportStrategyFootball implements SportStrategy {

    @Override
    public String lightResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Light",
                "Football",
                "Highly likely this is Football. \n Easy AI verification can be applied.");
    }

    @Override
    public String mediumResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Medium",
                "Football",
                "Likely Football, but some doubts remain.\n Moderate AI verification can be applied.");
    }

    @Override
    public String heavyResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Heavy",
                "Football",
                "Significant doubts, some indications of Football.\n Intensive AI verification recommended.");
    }
}

