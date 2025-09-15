package strategy;

import dto.ImageData;

public class SportStrategyFootball implements SportStrategy {

    @Override
    public void lightCheck(ImageData imageData) {
        System.out.println("Football Light Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "% green)");
    }

    @Override
    public void mediumCheck(ImageData imageData) {
        System.out.println("Football Medium Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "% green)");
    }

    @Override
    public void heavyCheck(ImageData imageData) {
        System.out.println("Football Heavy Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "% green)");
    }
}
