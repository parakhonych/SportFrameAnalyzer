package factory;

import org.opencv.core.Mat;
import util.ColorAnalyzer;
import dto.DominantColor;

public class SportStrategyFactory {
    /**
     * Factory method to get dominant color using ColorAnalyzer
     *
     * @param image - input image
     * @return dominant color name
     */
    public static void analyzeImageAndSelectStrategy(Mat image) {
        DominantColor dominant = ColorAnalyzer.getDominantColor(image);
        System.out.println("Dominant color: " + dominant);
    }

}
