package strategy;

import dto.ImageData;

public class SportStrategyTennis implements SportStrategy {

    @Override
    public String lightResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Light",
                "Tennis on clay",
                "Highly likely this is Tennis on clay. \nEasy AI verification can be applied.");
    }

    @Override
    public String mediumResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Medium",
                "Tennis on clay",
                "Likely Tennis on clay, but some doubts remain.\nModerate AI verification can be applied.");
    }

    @Override
    public String heavyResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Heavy",
                "Tennis on clay",
                "Significant doubts, some indications of Tennis on clay.\nIntensive AI verification recommended.");
    }
}
