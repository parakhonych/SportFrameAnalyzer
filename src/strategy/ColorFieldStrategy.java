package strategy;

import dto.ImageData;
import org.opencv.core.Mat;

public interface ColorFieldStrategy {
    void analyze(ImageData imageData);

}
