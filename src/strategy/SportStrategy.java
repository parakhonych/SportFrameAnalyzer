package strategy;

import dto.ImageData;

public interface SportStrategy {

    String lightResourcesAICheck(ImageData imageData);

    String mediumResourcesAICheck(ImageData imageData);

    String heavyResourcesAICheck(ImageData imageData);

    default String formatText(ImageData imageData, String checkLevel, String sportType, String comment) {
        String sportOutput;
        if (imageData.getDominantColor().getPercentage() < 35) {
            sportOutput = "Possible " + sportType + " (uncertain)";
        } else {
            sportOutput = sportType;
        }
        return "Image name: " + imageData.getImageName() + "\n" +
                "Dominant color: " + imageData.getDominantColor().getColor() +
                " (" + String.format("%.2f", imageData.getDominantColor().getPercentage()) + "%)\n" +
                "Sport type: " + sportType + "\n" +
                "Check level need: " + checkLevel + "\n" +
                "Comment: " + comment;

    }
}
