package strategy;

import dto.ImageData;

public class SportStrategySoccer implements SportStrategy {

    @Override
    public void lightCheck(ImageData imageData) {
        System.out.println("Soccer Light Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "% green)");
    }

    @Override
    public void mediumCheck(ImageData imageData) {
        System.out.println("Soccer Medium Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "% green)");
    }

    @Override
    public void heavyCheck(ImageData imageData) {
        System.out.println("Soccer Heavy Check: "
                + imageData.getImagePath()
                + " (" + imageData.getDominantColor().getPercentage() + "% green)");
    }
}
