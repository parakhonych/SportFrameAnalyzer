package strategy;

import dto.ImageData;

public class SportStrategyBasketball implements SportStrategy {

    @Override
    public void lightCheck(ImageData imageData) {
        System.out.println("Basketball Light Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "%)");
    }

    @Override
    public void mediumCheck(ImageData imageData) {
        System.out.println("Basketball Medium Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "%)");
    }

    @Override
    public void heavyCheck(ImageData imageData) {
        System.out.println("Basketball Heavy Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "%)");
    }
}
