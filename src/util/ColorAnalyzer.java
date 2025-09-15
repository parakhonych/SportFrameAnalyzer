package util;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;
import org.opencv.core.CvType;
import org.opencv.core.Size;
import org.opencv.core.Scalar;
import dto.DominantColor;

public class ColorAnalyzer {
    /**
     * Analyze image and return dominant color with its percentage.
     * Only considers green, white, and orange.
     *
     * @param image - input OpenCV Mat image to analyze
     * @return DominantColor object containing:
     * - colorName: name of the dominant color ("green", "white", or "orange")
     * - percentage: percentage of the image covered by this color
     */

    public static DominantColor getDominantColor(Mat image) {
        Mat hsv = new Mat();
        Imgproc.cvtColor(image, hsv, Imgproc.COLOR_BGR2HSV);

        int greenCount = 0, whiteCount = 0, orangeCount = 0;

        for (int i = 0; i < hsv.rows(); i++) {
            for (int j = 0; j < hsv.cols(); j++) {
                double[] pixel = hsv.get(i, j);
                double h = pixel[0]; // Hue
                double s = pixel[1]; // Saturation
                double v = pixel[2]; // Value

                if (s < 30 && v > 200) { // White
                    whiteCount++;
                } else if (h >= 35 && h <= 85) { // Green
                    greenCount++;
                } else if (h >= 10 && h <= 25) { // Orange
                    orangeCount++;
                }
            }
        }

        int total = hsv.rows() * hsv.cols();
        double greenPerc = (greenCount * 100.0) / total;
        double whitePerc = (whiteCount * 100.0) / total;
        double orangePerc = (orangeCount * 100.0) / total;

        // Find max
        if (greenPerc >= whitePerc && greenPerc >= orangePerc) {
            return new DominantColor("Green", greenPerc);
        } else if (whitePerc >= greenPerc && whitePerc >= orangePerc) {
            return new DominantColor("White", whitePerc);
        } else {
            return new DominantColor("Orange", orangePerc);
        }
    }

}
