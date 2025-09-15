package dto;

import org.opencv.core.Mat;

import java.nio.file.Paths;

public class ImageData {
    private final String imagePath;
    private final Mat image;
    private final String imageName;
    private DominantColor dominantColor;

    public ImageData(String imagePath, Mat image) {
        this.imagePath = imagePath;
        this.image = image;
        this.imageName = Paths.get(imagePath).getFileName().toString();
    }

    public String getImagePath() {
        return imagePath;
    }

    public Mat getImage() {
        return image;
    }

    public String getImageName() {
        return imageName;
    }

    public DominantColor getDominantColor() {
        return dominantColor;
    }

    public void setDominantColor(DominantColor dominantColor) {
        this.dominantColor = dominantColor;
    }
}
