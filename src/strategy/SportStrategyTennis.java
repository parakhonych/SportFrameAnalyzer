package strategy;

import dto.ImageData;

public class SportStrategyTennis implements SportStrategy {

    @Override
    public void lightCheck(ImageData imageData) {
        System.out.println("Tennis Light Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "%)");
    }

    @Override
    public void mediumCheck(ImageData imageData) {
        System.out.println("Tennis Medium Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "%)");
    }

    @Override
    public void heavyCheck(ImageData imageData) {
        System.out.println("Tennis Heavy Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "%)");
    }
}
