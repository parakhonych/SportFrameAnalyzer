package strategy;

import dto.ImageData;

public class SportStrategyBasketball implements SportStrategy {

    @Override
    public String lightResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Light",
                "Basketball",
                "Highly likely this is Basketball. \nEasy AI verification can be applied.");
    }

    @Override
    public String mediumResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Medium",
                "Basketball",
                "Likely Basketball, but some doubts remain.\nModerate AI verification can be applied.");
    }

    @Override
    public String heavyResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Heavy",
                "Basketball",
                "Significant doubts, some indications of Basketball.\nIntensive AI verification recommended.");
    }
}
