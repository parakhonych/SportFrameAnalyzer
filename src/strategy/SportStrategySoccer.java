package strategy;

import dto.ImageData;

public class SportStrategySoccer implements SportStrategy {

    @Override
    public String lightResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Light",
                "Soccer",
                "Highly likely this is Soccer. \n Easy AI verification can be applied.");
    }

    @Override
    public String mediumResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Medium",
                "Soccer",
                "Likely Soccer, but some doubts remain.\n Moderate AI verification can be applied.");
    }

    @Override
    public String heavyResourcesAICheck(ImageData imageData) {
        return formatText(imageData,
                "Heavy",
                "Soccer",
                "Significant doubts, some indications of Soccer.\n Intensive AI verification recommended.");
    }
}
