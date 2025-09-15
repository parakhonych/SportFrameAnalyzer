package strategy;

import dto.ImageData;

public class SportStrategyHockey implements SportStrategy {

    @Override
    public void lightCheck(ImageData imageData) {
        System.out.println("Hockey Light Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "% white)");
    }

    @Override
    public void mediumCheck(ImageData imageData) {
        System.out.println("Hockey Medium Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "% white)");
    }

    @Override
    public void heavyCheck(ImageData imageData) {
        System.out.println("Hockey Heavy Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "% white)");
    }
}
